package com.vyach.worldskillsbank;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class SigninDialogFragment extends DialogFragment {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
      return builder
              .setTitle("Авторизация")
              .setView(R.layout.toast_registration)
              .setPositiveButton("OK", null)
              .setNegativeButton("Отмена", null)
              .create();
    }
}
