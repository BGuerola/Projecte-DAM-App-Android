package com.example.seniortalentjobs.ui.notificaciones;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
//import androidx.activity.viewModels;
import androidx.lifecycle.ViewModelProviders;


import com.example.seniortalentjobs.MainActivity;
import com.example.seniortalentjobs.OfertaActivity;
import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.ui.mensajes.MensajesFragment;

public class NotificacionesFragment extends Fragment {

    private notificacionesViewModel notificacionesViewModel;
    private Button btnnotifc;
    NotificationCompat.Builder notificacion;
    NotificationManager nm;


    private static final int idUnic = 1234;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        galleryViewModel: notificacionesViewModel by viewModels();
        notificacionesViewModel =
                ViewModelProviders.of(this).get(notificacionesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notificaciones, container, false);
        final TextView textView = root.findViewById(R.id.text_notificaciones);
        notificacionesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);

        btnnotifc = getActivity().findViewById(R.id.btnnotific);


        //if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            String CHANNEL_ID = "my_channel_01";
            CharSequence name = "my_channel";
            String Description = "This is my channel";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            final NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
            mChannel.setDescription(Description);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            mChannel.setShowBadge(false);

        //}

        notificacion = new NotificationCompat.Builder(getContext(), CHANNEL_ID);
        notificacion.setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.ic_menu_gallery)
                .setTicker("Nueva notificación")
                .setPriority(Notification.PRIORITY_MAX) // this is deprecated in API 26 but you can still use for below 26. check below update for 26 API
                .setContentTitle("Título")
                .setContentText("Esto es el texto que va a salir en la notificación")
                .setContentInfo("Info");

        Intent intent = new Intent (getContext(), OfertaActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getContext(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notificacion.setContentIntent(pendingIntent);

        btnnotifc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager nm = (NotificationManager)getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
                nm.createNotificationChannel(mChannel);
                nm.notify(idUnic, notificacion.build());
            }
        });

    }
}