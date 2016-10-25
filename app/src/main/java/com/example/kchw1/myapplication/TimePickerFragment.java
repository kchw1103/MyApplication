package com.example.kchw1.myapplication;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.app.DialogFragment;
import android.app.Dialog;
import java.util.Calendar;
import android.widget.TimePicker;

/**
 * Created by kchw1 on 2016-10-25.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute){
        TextView tv = (TextView) getActivity().findViewById(R.id.ready);
        //TextView tv = (TextView) getActivity().findViewById(R.id.exercise);
        //TextView tv = (TextView) getActivity().findViewById(R.id.rest);

        tv.setText("Ready\n");
        //tv.setText("Exercise\n");
        //tv.setText("Rest\n");

        tv.setText(tv.getText() + String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
    }
}

