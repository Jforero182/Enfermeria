// Generated by view binder compiler. Do not edit!
package com.example.notasenfermeria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notasenfermeria.DRawing;
import com.example.notasenfermeria.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView closeBtn;

  @NonNull
  public final DRawing drawSpace;

  @NonNull
  public final TextView eraseBtn;

  private PopBinding(@NonNull RelativeLayout rootView, @NonNull TextView closeBtn,
      @NonNull DRawing drawSpace, @NonNull TextView eraseBtn) {
    this.rootView = rootView;
    this.closeBtn = closeBtn;
    this.drawSpace = drawSpace;
    this.eraseBtn = eraseBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.pop, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close_btn;
      TextView closeBtn = ViewBindings.findChildViewById(rootView, id);
      if (closeBtn == null) {
        break missingId;
      }

      id = R.id.draw_space;
      DRawing drawSpace = ViewBindings.findChildViewById(rootView, id);
      if (drawSpace == null) {
        break missingId;
      }

      id = R.id.erase_btn;
      TextView eraseBtn = ViewBindings.findChildViewById(rootView, id);
      if (eraseBtn == null) {
        break missingId;
      }

      return new PopBinding((RelativeLayout) rootView, closeBtn, drawSpace, eraseBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
