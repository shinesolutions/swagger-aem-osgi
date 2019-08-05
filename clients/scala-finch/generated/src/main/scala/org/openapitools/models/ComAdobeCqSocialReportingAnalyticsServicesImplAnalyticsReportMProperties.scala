package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param reportPeriodfetchPerioddelay 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(reportPeriodfetchPerioddelay: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties] = deriveEncoder
}
