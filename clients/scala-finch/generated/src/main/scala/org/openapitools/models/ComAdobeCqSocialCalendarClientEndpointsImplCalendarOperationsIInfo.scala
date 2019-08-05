package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties]
                )

object ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo] = deriveEncoder
}
