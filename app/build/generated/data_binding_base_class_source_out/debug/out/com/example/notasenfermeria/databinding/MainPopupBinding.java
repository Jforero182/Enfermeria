// Generated by view binder compiler. Do not edit!
package com.example.notasenfermeria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notasenfermeria.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainPopupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Spinner Turno;

  @NonNull
  public final EditText search;

  @NonNull
  public final TextView sendBtn;

  @NonNull
  public final TextView textView7;

  private MainPopupBinding(@NonNull RelativeLayout rootView, @NonNull Spinner Turno,
      @NonNull EditText search, @NonNull TextView sendBtn, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.Turno = Turno;
    this.search = search;
    this.sendBtn = sendBtn;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Turno;
      Spinner Turno = ViewBindings.findChildViewById(rootView, id);
      if (Turno == null) {
        break missingId;
      }

      id = R.id.search;
      EditText search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.send_btn;
      TextView sendBtn = ViewBindings.findChildViewById(rootView, id);
      if (sendBtn == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new MainPopupBinding((RelativeLayout) rootView, Turno, search, sendBtn, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
