// Generated by view binder compiler. Do not edit!
package com.example.notasenfermeria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
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

public final class ActivityRegistroMedicamentoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addBtn;

  @NonNull
  public final Button cardBtn;

  @NonNull
  public final Button dateBtn;

  @NonNull
  public final TextView dateText;

  @NonNull
  public final AutoCompleteTextView medicaments;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView9;

  private ActivityRegistroMedicamentoBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button addBtn, @NonNull Button cardBtn, @NonNull Button dateBtn,
      @NonNull TextView dateText, @NonNull AutoCompleteTextView medicaments,
      @NonNull TextView textView2, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.addBtn = addBtn;
    this.cardBtn = cardBtn;
    this.dateBtn = dateBtn;
    this.dateText = dateText;
    this.medicaments = medicaments;
    this.textView2 = textView2;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistroMedicamentoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistroMedicamentoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registro_medicamento, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistroMedicamentoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_btn;
      Button addBtn = ViewBindings.findChildViewById(rootView, id);
      if (addBtn == null) {
        break missingId;
      }

      id = R.id.card_btn;
      Button cardBtn = ViewBindings.findChildViewById(rootView, id);
      if (cardBtn == null) {
        break missingId;
      }

      id = R.id.date_btn;
      Button dateBtn = ViewBindings.findChildViewById(rootView, id);
      if (dateBtn == null) {
        break missingId;
      }

      id = R.id.date_text;
      TextView dateText = ViewBindings.findChildViewById(rootView, id);
      if (dateText == null) {
        break missingId;
      }

      id = R.id.medicaments;
      AutoCompleteTextView medicaments = ViewBindings.findChildViewById(rootView, id);
      if (medicaments == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new ActivityRegistroMedicamentoBinding((ConstraintLayout) rootView, addBtn, cardBtn,
          dateBtn, dateText, medicaments, textView2, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
