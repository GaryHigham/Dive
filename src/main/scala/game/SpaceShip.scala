package game

import core.PhysicsThing
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

class SpaceShip extends PhysicsThing {

  def load() = {
    val texture: Texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("/Users/gary/Documents/Dev/Scala/Dive/Dive/resources/rocket.png"));
    println("Texture loaded: " + texture);
    println(">> Image width: " + texture.getImageWidth());
    println(">> Image height: " + texture.getImageHeight());
    println(">> Texture width: " + texture.getTextureWidth());
    println(">> Texture height: " + texture.getTextureHeight());
    println(">> Texture ID: " + texture.getTextureID());
  }
}