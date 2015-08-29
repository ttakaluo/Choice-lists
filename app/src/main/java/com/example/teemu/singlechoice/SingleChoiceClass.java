package com.example.teemu.singlechoice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by Teemu on 29.8.2015.
 */
public class SingleChoiceClass extends DialogFragment {
    final CharSequence[] items = {"Easy", "Medium", "Hard"};
    String selection;
    @Override
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Choose difficulty level");
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                switch (arg1) {
                    case 0:
                        selection = (String) items[arg1];
                        break;
                    case 1:
                        selection = (String) items[arg1];
                        break;
                    case 2:
                        selection = (String) items[arg1];
                        break;

                }
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Your difficulty level is: " + selection, Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }

}
