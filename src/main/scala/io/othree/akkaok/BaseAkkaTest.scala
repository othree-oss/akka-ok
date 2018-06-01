package io.othree.akkaok

import akka.actor.ActorSystem
import akka.testkit.TestKit
import io.othree.aok.BaseTest

abstract class BaseAkkaTest(_system: ActorSystem) extends TestKit(_system) with BaseTest
