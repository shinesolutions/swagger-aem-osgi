package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommercePimImplPageEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommercePimImplPageEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommercePimImplPageEventListenerProperties]
                )

object ComAdobeCqCommercePimImplPageEventListenerInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplPageEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplPageEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplPageEventListenerInfo] = deriveEncoder
}
