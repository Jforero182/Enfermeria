// Generated by view binder compiler. Do not edit!
package com.example.notasenfermeria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityControlLiquidosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView ControlLiquidos;

  @NonNull
  public final Button Eliminada;

  @NonNull
  public final Button Recibida;

  @NonNull
  public final Button dateBtn;

  @NonNull
  public final EditText efechaLiquidos;

  private ActivityControlLiquidosBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView ControlLiquidos, @NonNull Button Eliminada, @NonNull Button Recibida,
      @NonNull Button dateBtn, @NonNull EditText efechaLiquidos) {
    this.rootView = rootView;
    this.ControlLiquidos = ControlLiquidos;
    this.Eliminada = Eliminada;
    this.Recibida = Recibida;
    this.dateBtn = dateBtn;
    this.efechaLiquidos = efechaLiquidos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityControlLiquidosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityControlLiquidosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_control_liquidos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityControlLiquidosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ControlLiquidos;
      TextView ControlLiquidos = ViewBindings.findChildViewById(rootView, id);
      if (ControlLiquidos == null) {
        break missingId;
      }

      id = R.id.Eliminada;
      Button Eliminada = ViewBindings.findChildViewById(rootView, id);
      if (Eliminada == null) {
        break missingId;
      }

      id = R.id.Recibida;
      Button Recibida = ViewBindings.findChildViewById(rootView, id);
      if (Recibida == null) {
        break missingId;
      }

      id = R.id.date_btn;
      Button dateBtn = ViewBindings.findChildViewById(rootView, id);
      if (dateBtn == null) {
        break missingId;
      }

      id = R.id.efecha_liquidos;
      EditText efechaLiquidos = ViewBindings.findChildViewById(rootView, id);
      if (efechaLiquidos == null) {
        break missingId;
      }

      return new ActivityControlLiquidosBinding((ConstraintLayout) rootView, ControlLiquidos,
          Eliminada, Recibida, dateBtn, efechaLiquidos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
