package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodtopics 
 * @param eventPeriodfilter 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties(eventPeriodtopics: Option[ConfigNodePropertyString],
                eventPeriodfilter: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties] = deriveEncoder
}
