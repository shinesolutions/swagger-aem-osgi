package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param priority 
 */
case class MessagingUserComponentFactoryProperties(priority: Option[ConfigNodePropertyInteger]
                )

object MessagingUserComponentFactoryProperties {
    /**
     * Creates the codec for converting MessagingUserComponentFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[MessagingUserComponentFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessagingUserComponentFactoryProperties] = deriveEncoder
}
