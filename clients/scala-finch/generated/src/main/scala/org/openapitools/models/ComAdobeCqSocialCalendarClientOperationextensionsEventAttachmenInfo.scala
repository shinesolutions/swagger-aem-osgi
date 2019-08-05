package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties]
                )

object ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo] = deriveEncoder
}
