import com.github.gradle.node.yarn.task.YarnTask

plugins {
  id("com.github.node-gradle.node") version "3.1.1"
}

tasks.register<YarnTask>("build") {
  dependsOn("yarn_test")
  args.set(listOf("generate"))
}
