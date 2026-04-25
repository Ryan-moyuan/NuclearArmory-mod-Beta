#!/bin/sh
# Gradle wrapper script

DIRNAME=$(cd "$(dirname "$0")" && pwd)
exec java -classpath "$DIRNAME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
