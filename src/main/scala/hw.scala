import core.Engine
import game.SpaceShip
//import org.newdawn.slick.opengl.Texture;
//import org.newdawn.slick.opengl.TextureLoader;
//import org.newdawn.slick.util.ResourceLoader;

object Hi {

  val engine: Engine = new Engine

  def main(args: Array[String]) = {
  	setupThings
  	engine.start(update)
  }

  def update() = {
  	println("Game update loop")
  }

  def setupThings() {
  	/*
  	val texture: Texture = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("/Users/highag01/Documents/workspace/Dive/resources/logo.jpg"));

	println("Texture loaded: "+texture);

	println(">> Image width: "+texture.getImageWidth());

	println(">> Image height: "+texture.getImageHeight());

	println(">> Texture width: "+texture.getTextureWidth());

	println(">> Texture height: "+texture.getTextureHeight());

	println(">> Texture ID: "+texture.getTextureID());
	*/
  	engine.scene.addThing(new SpaceShip)
  }
}