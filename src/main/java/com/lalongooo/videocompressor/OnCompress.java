package com.lalongooo.videocompressor;

public interface OnCompress {
    void onCompressProgress(String id, long percent);
    void onCompressFinish(String id);
}
