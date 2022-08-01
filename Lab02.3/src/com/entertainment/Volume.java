package com.entertainment;

public interface Volume {

  public void setVolume(int volume);

  public int getVolume();

  default void mute() {
    if (!isMuted()) {           // not currently muted
      setOldVolume(getVolume());  // store current volume in oldVolume
      setVolume(0);             // set volume to zero
    } else {                      // currently muted
      setVolume(getOldVolume());     // restore volume from oldVolume value
    }
    setMuted(!isMuted());         // toggle muted flag
  }

  int getOldVolume();

  void setOldVolume(int volume);

  public boolean isMuted();

  void setMuted(boolean muted);

  default void silence() {
    setVolume(0);
  }

  static void silenceAll(Volume... vols) {
    for (Volume v : vols) {
      v.silence();
    }
  }

}





