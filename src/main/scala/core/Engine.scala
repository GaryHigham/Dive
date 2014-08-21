package core

import org.lwjgl.opengl.Display
import org.lwjgl.opengl.DisplayMode

object Engine {

  def start() = {
    Display.setDisplayMode(new DisplayMode(800,600));
    Display.create();
    run
  }
  
  def run():Unit = {
    Display.update();
    run
  }
  
}