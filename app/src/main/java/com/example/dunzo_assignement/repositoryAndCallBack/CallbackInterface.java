package com.example.dunzo_assignement.repositoryAndCallBack;

import android.graphics.Bitmap;
import com.example.dunzo_assignement.model.Photo;
import java.util.List;

public interface CallbackInterface {

    void updateImagesList(List<Photo> photoList);
    void updateImageBitmap(Bitmap bitmap);
}
