import core.Engine
import game.SpaceShip
//import org.newdawn.slick.opengl.Texture;
//import org.newdawn.slick.opengl.TextureLoader;
//import org.newdawn.slick.util.ResourceLoader;

object Hi {

  val engine: Engine = new Engine
  var setup: Boolean = false;

  def main(args: Array[String]) = {
    engine.start(update)
  }

  def update() = {
    println("Game update loop")
    if (!setup) {
      setupThings
      setup = true;
    }
  }

  def setupThings() {
    val ship = new SpaceShip
    ship.load
    engine.scene.addThing(ship)
  }
}