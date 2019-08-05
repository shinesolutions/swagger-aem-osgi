package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties]
                )

object ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo] = deriveEncoder
}
