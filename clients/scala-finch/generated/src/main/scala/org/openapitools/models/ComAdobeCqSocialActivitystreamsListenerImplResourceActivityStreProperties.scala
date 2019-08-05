package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param streamPath 
 * @param streamName 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(streamPath: Option[ConfigNodePropertyString],
                streamName: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties] = deriveEncoder
}
