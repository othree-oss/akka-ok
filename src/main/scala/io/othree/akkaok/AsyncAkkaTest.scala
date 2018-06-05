package io.othree.akkaok

import akka.actor.ActorSystem
import akka.testkit.TestKit
import io.othree.aok.AsyncBaseTest

abstract class AsyncAkkaTest (system: ActorSystem) extends TestKit(system) with AsyncBaseTest
