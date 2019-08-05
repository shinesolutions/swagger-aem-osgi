package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties]
                )

object ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo] = deriveEncoder
}
