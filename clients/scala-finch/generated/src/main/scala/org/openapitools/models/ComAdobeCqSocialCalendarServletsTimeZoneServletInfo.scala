package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCalendarServletsTimeZoneServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCalendarServletsTimeZoneServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCalendarServletsTimeZoneServletProperties]
                )

object ComAdobeCqSocialCalendarServletsTimeZoneServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCalendarServletsTimeZoneServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = deriveEncoder
}
