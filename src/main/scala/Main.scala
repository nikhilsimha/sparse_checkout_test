package ai.chronon

import org.eclipse.jgit.api.Git

import java.io.File

object Main {
  def main(args: Array[String]): Unit = {
    val url = "https://github.com/airbnb/chronon"
    val hash = "origin/main"
    val subPath = "api/py"
    val dest = "myclone"

    val localPath = new File(dest)
    println(s"Writing to file: ${localPath.toPath.toAbsolutePath.toString}")

    val gitRepo = Git.cloneRepository.setURI(url).setDirectory(localPath).setNoCheckout(true).call
    gitRepo.checkout.setStartPoint(hash).addPath(subPath).call
    gitRepo.getRepository.close
  }
}