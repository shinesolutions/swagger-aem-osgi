package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval 
 * @param cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize 
 */
case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval: Option[ConfigNodePropertyInteger],
                cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties] = deriveEncoder
}
