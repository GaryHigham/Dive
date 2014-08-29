package core

class Scene {

	var things: Set[Thing] = Set()

	def update() = {
		things.map(thing => thing.update)
	}

	def render() = {
		things.map(thing => thing.render)
	}
	
	def addThing(thing: Thing) = {
		things = things + thing
	}

	def removeThing(thing: Thing) = {
		things = things - thing
	}
}