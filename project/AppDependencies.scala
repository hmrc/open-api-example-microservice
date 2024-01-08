import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object AppDependencies {

  lazy val bootstrapVersion = "7.12.0"

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-backend-play-28"  % bootstrapVersion
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-28"     % bootstrapVersion,
    "org.scalatest"           %% "scalatest"                  % "3.2.17",
    "com.vladsch.flexmark"    %  "flexmark-all"               % "0.62.2"
  ).map(_ % "test, it")
}
