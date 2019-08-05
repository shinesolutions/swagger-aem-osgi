package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties]
                )

object ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo] = deriveEncoder
}
