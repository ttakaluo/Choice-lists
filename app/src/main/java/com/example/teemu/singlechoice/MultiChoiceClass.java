package com.example.teemu.singlechoice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Teemu on 29.8.2015.
 */
public class MultiChoiceClass extends DialogFragment {
    ArrayList<String> list = new ArrayList<String>();
    @Override
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = getResources().getStringArray(R.array.my_color_selection);
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Choose color");
        builder.setMultiChoiceItems(R.array.my_color_selection, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                if (isChecked){
                    list.add(items[which]);
                }
                else if(list.contains(items[which])){
                    list.remove(items[which]);
                }
            }


        }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selections = "";
                for (String ms : list) {
                    selections = selections + "\n" + ms;
                }
                Toast.makeText(getActivity(), "Color selection: " + selections, Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
