package io.othree.akkaok

import akka.actor.ActorSystem
import akka.testkit.TestKit
import io.othree.aok.BaseTest

abstract class BaseAkkaTest(system: ActorSystem) extends TestKit(system) with BaseTest
