package com.dblazejewski

import akka.actor.ActorSystem
import com.dblazejewski.akkaremote.model.RemoteProtocol.StreamWork

object AkkaRemoteStart extends App {
  val system: ActorSystem = ActorSystem("helloAkka")

  val streamActorFutureSuccessful = system.actorSelection("akka.tcp://akka@127.0.0.1:2552/user/streamActorFutureApply")

  streamActorFutureSuccessful ! StreamWork(1000)
}
