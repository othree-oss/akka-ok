package io.othree.akkaok

import akka.actor.ActorSystem
import akka.testkit.TestKit
import io.othree.aok.AsyncBaseTest

abstract class AsyncAkkaTest (_system: ActorSystem) extends TestKit(_system) with AsyncBaseTest
