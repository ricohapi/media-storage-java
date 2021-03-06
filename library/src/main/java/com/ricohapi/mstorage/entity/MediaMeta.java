//
//  Copyright (c) 2016 Ricoh Company, Ltd. All Rights Reserved.
//  See LICENSE for more information
//

package com.ricohapi.mstorage.entity;

import java.util.Map;
import com.ricohapi.mstorage.response.RespMeta;

public class MediaMeta {

    private Map<String, String> exif;
    private Map<String, String> gpano;
    private Map<String, String> userMeta;

    public MediaMeta(RespMeta meta){
        this.exif = meta.getExif();
        this.gpano = meta.getGpano();
        this.userMeta = meta.getUser();
    }

    public Map<String, String> getExif() {
        return exif;
    }

    public void setExif(Map<String, String> exif) { this.exif = exif; }

    public Map<String, String> getGpano() {
        return gpano;
    }

    public void setGpano(Map<String, String> gpano) { this.gpano = gpano; }

    public Map<String, String> getUserMeta() {
        return userMeta;
    }

    public void setUserMeta(Map<String, String> user) { this.userMeta = user; }
}
