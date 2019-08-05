package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping 
 * @param priority 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping: Option[ConfigNodePropertyArray],
                priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties] = deriveEncoder
}
