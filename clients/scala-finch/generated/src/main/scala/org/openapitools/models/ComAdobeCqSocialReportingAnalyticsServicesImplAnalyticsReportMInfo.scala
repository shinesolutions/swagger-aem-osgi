package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo] = deriveEncoder
}
