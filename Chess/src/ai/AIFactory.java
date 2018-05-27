package ai;

import ai.joc_ai.Level1;
import ai.joc_ai.Level2;
















public class AIFactory
{
  public AIFactory() {}
  
  public static final AI getAI(int level)
  {
    AI result = new Level1();
    if (1 == level)
    {
      result = new Level1();
    }
    else if (2 == level)
    {
      result = new Level2();
    }
    return result;
  }
  
  public static final AI getAI(String level)
  {
    return getAI(Integer.parseInt(level));
  }
}
