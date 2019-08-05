package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param timezonesPeriodexpirytime 
 */
case class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(timezonesPeriodexpirytime: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCalendarServletsTimeZoneServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCalendarServletsTimeZoneServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCalendarServletsTimeZoneServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCalendarServletsTimeZoneServletProperties] = deriveEncoder
}
