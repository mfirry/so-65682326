package yolo

object Main {

  def lengthOfUUID() = {
    import java.util.UUID
    val x = UUID.randomUUID
    x.toString.length
  }
}
