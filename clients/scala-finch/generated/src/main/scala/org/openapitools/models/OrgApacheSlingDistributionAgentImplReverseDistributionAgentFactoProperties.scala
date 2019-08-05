package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param title 
 * @param details 
 * @param enabled 
 * @param serviceName 
 * @param logPeriodlevel 
 * @param queuePeriodprocessingPeriodenabled 
 * @param packageExporterPeriodendpoints 
 * @param pullPerioditems 
 * @param httpPeriodconnPeriodtimeout 
 * @param requestAuthorizationStrategyPeriodtarget 
 * @param transportSecretProviderPeriodtarget 
 * @param packageBuilderPeriodtarget 
 * @param triggersPeriodtarget 
 */
case class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(name: Option[ConfigNodePropertyString],
                title: Option[ConfigNodePropertyString],
                details: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                serviceName: Option[ConfigNodePropertyString],
                logPeriodlevel: Option[ConfigNodePropertyDropDown],
                queuePeriodprocessingPeriodenabled: Option[ConfigNodePropertyBoolean],
                packageExporterPeriodendpoints: Option[ConfigNodePropertyArray],
                pullPerioditems: Option[ConfigNodePropertyInteger],
                httpPeriodconnPeriodtimeout: Option[ConfigNodePropertyInteger],
                requestAuthorizationStrategyPeriodtarget: Option[ConfigNodePropertyString],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString],
                triggersPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties] = deriveEncoder
}
