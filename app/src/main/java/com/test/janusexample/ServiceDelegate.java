package com.test.janusexample;

import com.github.helloiampau.janus.generated.Bundle;
import com.github.helloiampau.janus.generated.JanusEvent;

public interface ServiceDelegate {

  public void onEvent(JanusEvent event, Bundle payload);

}
