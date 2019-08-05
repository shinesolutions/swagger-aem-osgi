package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo] = deriveEncoder
}
