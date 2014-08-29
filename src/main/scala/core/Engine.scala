package core

class Engine {

	val renderer: Renderer = new Renderer
	val scene: Scene = new Scene

  	def start(gameUpdateLoop: () => Unit) = {
    	renderer setDisplayMode(400, 400)
    	run(gameUpdateLoop)
  	}
  
  	def run(gameUpdateLoop: () => Unit):Unit = {
  		gameUpdateLoop()
  		update
  		render
    	run(gameUpdateLoop)
  	}

  	def update = {
  		scene update
  	}

  	def render = {
  		renderer render(scene)
  	}

}