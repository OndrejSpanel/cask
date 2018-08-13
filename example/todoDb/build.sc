import mill._, scalalib._


trait AppModule extends ScalaModule{
  def scalaVersion = "2.12.6"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.0.3",
    ivy"org.xerial:sqlite-jdbc:3.18.0",
    ivy"io.getquill::quill-jdbc:2.5.4"
  )

  object test extends Tests{
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.6.3",
      ivy"com.lihaoyi::requests::0.1.2",
    )
  }
}