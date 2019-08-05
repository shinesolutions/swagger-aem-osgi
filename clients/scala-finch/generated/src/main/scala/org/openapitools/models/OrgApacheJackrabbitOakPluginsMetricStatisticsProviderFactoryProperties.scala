package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param providerType 
 */
case class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(providerType: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties] = deriveEncoder
}
