package core

import org.lwjgl.opengl.Display
import org.lwjgl.opengl.DisplayMode
import org.lwjgl.opengl.GL11

class Renderer {

	def setDisplayMode(width: Int, height: Int) = {
		Display.setDisplayMode(new DisplayMode(width,height))
    	Display.create()
		Display.setVSyncEnabled(true);
	}
 
	def render(scene: Scene) = {
		GLClear
		scene render()
		Display.update()
	}

	def GLClear() = {
  		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT)
  	}
}

