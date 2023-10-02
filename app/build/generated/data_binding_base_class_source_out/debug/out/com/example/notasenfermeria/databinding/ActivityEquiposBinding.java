// Generated by view binder compiler. Do not edit!
package com.example.notasenfermeria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notasenfermeria.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEquiposBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Spinner Equipos;

  @NonNull
  public final Button addBtn;

  @NonNull
  public final TextView elequipo;

  @NonNull
  public final TextView estado;

  @NonNull
  public final Spinner estadoeq;

  @NonNull
  public final EditText serial;

  @NonNull
  public final EditText serial2;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView20;

  private ActivityEquiposBinding(@NonNull ConstraintLayout rootView, @NonNull Spinner Equipos,
      @NonNull Button addBtn, @NonNull TextView elequipo, @NonNull TextView estado,
      @NonNull Spinner estadoeq, @NonNull EditText serial, @NonNull EditText serial2,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView20) {
    this.rootView = rootView;
    this.Equipos = Equipos;
    this.addBtn = addBtn;
    this.elequipo = elequipo;
    this.estado = estado;
    this.estadoeq = estadoeq;
    this.serial = serial;
    this.serial2 = serial2;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView20 = textView20;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEquiposBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEquiposBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_equipos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEquiposBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Equipos;
      Spinner Equipos = ViewBindings.findChildViewById(rootView, id);
      if (Equipos == null) {
        break missingId;
      }

      id = R.id.add_btn;
      Button addBtn = ViewBindings.findChildViewById(rootView, id);
      if (addBtn == null) {
        break missingId;
      }

      id = R.id.elequipo;
      TextView elequipo = ViewBindings.findChildViewById(rootView, id);
      if (elequipo == null) {
        break missingId;
      }

      id = R.id.estado;
      TextView estado = ViewBindings.findChildViewById(rootView, id);
      if (estado == null) {
        break missingId;
      }

      id = R.id.estadoeq;
      Spinner estadoeq = ViewBindings.findChildViewById(rootView, id);
      if (estadoeq == null) {
        break missingId;
      }

      id = R.id.serial;
      EditText serial = ViewBindings.findChildViewById(rootView, id);
      if (serial == null) {
        break missingId;
      }

      id = R.id.serial2;
      EditText serial2 = ViewBindings.findChildViewById(rootView, id);
      if (serial2 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      return new ActivityEquiposBinding((ConstraintLayout) rootView, Equipos, addBtn, elequipo,
          estado, estadoeq, serial, serial2, textView10, textView11, textView20);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}