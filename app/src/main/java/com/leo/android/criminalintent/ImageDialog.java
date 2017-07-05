package com.leo.android.criminalintent;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by leonidtiskevic on 05.07.17.
 */

public class ImageDialog extends DialogFragment {

    private ImageView mImageView;
    private static String mImagePath;
    private static Context mContext;

    public static void getImage(String path, Context context){
        mImagePath = path;
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_image, container, false);
        mImageView = (ImageView) view.findViewById(R.id.suspect_image);
        Bitmap bitmap = PicturesUtils.getScaledBitmap(mImagePath, getActivity());
        mImageView.setImageBitmap(bitmap);
        return view;
    }
}
