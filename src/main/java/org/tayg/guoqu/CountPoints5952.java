/* CopyRight (c) org.tayg 2021-2021. All rights reserved. */

package org.tayg.guoqu;

import java.util.HashSet;

/**
 * solution for countPoints.
 *
 * @author guoqu
 * @since 2021-12-12
 */
public class CountPoints5952 {
  /**
   * count how many poles which have all 'RGB' rings.
   *
   * @param rings String, rings to count
   * @return int, count num
   */
  public int countPoints(String rings) {
    int poleNum = 10;
    HashSet<Character>[] poles = initPoles(poleNum);

    poles = updatePoles(poles, rings);

    int count = countPoles(poles);

    return count;
  }

  private HashSet<Character>[] updatePoles(HashSet<Character>[] poles, String rings) {
    for (int i = 0; i < rings.length(); i += 2) {
      Character color = rings.charAt(i);
      Character idxChar = rings.charAt(i + 1);
      int idx = Character.getNumericValue(idxChar); // Character -> int
      poles[idx].add(color);
    }

    return poles;
  }

  private int countPoles(HashSet<Character>[] poles) {
    int count = 0;
    for (int i = 0; i < poles.length; i++) {
      if (poles[i].size() == 3) {
        count++;
      }
    }
    return count;
  }

  private HashSet<Character>[] initPoles(int poleNum) {
    HashSet<Character>[] poles = new HashSet[poleNum];
    for (int i = 0; i < poleNum; i++) {
      poles[i] = new HashSet<>();
    }
    return poles;
  }
}
