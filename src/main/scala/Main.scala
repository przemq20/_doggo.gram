import com.github.instagram4j.instagram4j.IGClient
import com.github.instagram4j.instagram4j.actions.story.StoryAction
import com.github.instagram4j.instagram4j.actions.timeline.TimelineAction
import com.github.instagram4j.instagram4j.actions.users.UserAction
import com.github.instagram4j.instagram4j.requests.media.MediaConfigureToStoryRequest

import java.io.File
object Main extends App {
  val client: IGClient = IGClient.builder
    .username("")
    .password("")
    .login

  val photo = new File("dog1.jpg")

  client
    .actions()
    .timeline()
    .uploadPhoto(new File("dog1.jpg"), "dog.webp")
    .thenAccept(response => {
//      new StoryAction(client).uploadPhoto(response.getMedia.g)
//       client.actions().story() response.getMedia
//      response.getMedia.
      println(response)
    })
    .join()

//  client.actions().story().uploadPhoto(photo).thenAccept(response => println(response)).join()
}
