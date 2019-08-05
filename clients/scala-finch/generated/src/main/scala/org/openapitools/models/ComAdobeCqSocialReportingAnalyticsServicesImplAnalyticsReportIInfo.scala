package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo] = deriveEncoder
}
