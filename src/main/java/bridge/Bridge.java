package bridge;

import java.util.List;

public class Bridge {
  List<String> bridge;

  public Bridge(int size) {
    BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    bridge = bridgeMaker.makeBridge(size);
  }
}
