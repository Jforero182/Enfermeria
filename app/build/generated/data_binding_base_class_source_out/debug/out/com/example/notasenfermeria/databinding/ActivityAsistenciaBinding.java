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

public final class ActivityAsistenciaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Spinner Asistencia;

  @NonNull
  public final EditText Dfirmante;

  @NonNull
  public final Button agre;

  @NonNull
  public final View canvasView;

  @NonNull
  public final Spinner documentos;

  @NonNull
  public final Button eraseBtn;

  @NonNull
  public final EditText firmante;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView8;

  private ActivityAsistenciaBinding(@NonNull ConstraintLayout rootView, @NonNull Spinner Asistencia,
      @NonNull EditText Dfirmante, @NonNull Button agre, @NonNull View canvasView,
      @NonNull Spinner documentos, @NonNull Button eraseBtn, @NonNull EditText firmante,
      @NonNull TextView textView, @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.Asistencia = Asistencia;
    this.Dfirmante = Dfirmante;
    this.agre = agre;
    this.canvasView = canvasView;
    this.documentos = documentos;
    this.eraseBtn = eraseBtn;
    this.firmante = firmante;
    this.textView = textView;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAsistenciaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAsistenciaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_asistencia, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAsistenciaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Asistencia;
      Spinner Asistencia = ViewBindings.findChildViewById(rootView, id);
      if (Asistencia == null) {
        break missingId;
      }

      id = R.id.Dfirmante;
      EditText Dfirmante = ViewBindings.findChildViewById(rootView, id);
      if (Dfirmante == null) {
        break missingId;
      }

      id = R.id.agre;
      Button agre = ViewBindings.findChildViewById(rootView, id);
      if (agre == null) {
        break missingId;
      }

      id = R.id.canvasView;
      View canvasView = ViewBindings.findChildViewById(rootView, id);
      if (canvasView == null) {
        break missingId;
      }

      id = R.id.documentos;
      Spinner documentos = ViewBindings.findChildViewById(rootView, id);
      if (documentos == null) {
        break missingId;
      }

      id = R.id.erase_btn;
      Button eraseBtn = ViewBindings.findChildViewById(rootView, id);
      if (eraseBtn == null) {
        break missingId;
      }

      id = R.id.firmante;
      EditText firmante = ViewBindings.findChildViewById(rootView, id);
      if (firmante == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityAsistenciaBinding((ConstraintLayout) rootView, Asistencia, Dfirmante, agre,
          canvasView, documentos, eraseBtn, firmante, textView, textView3, textView4, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}