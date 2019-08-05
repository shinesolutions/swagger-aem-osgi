package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents 
 */
case class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties] = deriveEncoder
}
