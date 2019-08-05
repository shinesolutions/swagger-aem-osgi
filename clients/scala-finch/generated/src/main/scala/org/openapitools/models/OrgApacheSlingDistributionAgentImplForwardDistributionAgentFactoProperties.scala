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
 * @param allowedPeriodroots 
 * @param queuePeriodprocessingPeriodenabled 
 * @param packageImporterPeriodendpoints 
 * @param passiveQueues 
 * @param priorityQueues 
 * @param retryPeriodstrategy 
 * @param retryPeriodattempts 
 * @param requestAuthorizationStrategyPeriodtarget 
 * @param transportSecretProviderPeriodtarget 
 * @param packageBuilderPeriodtarget 
 * @param triggersPeriodtarget 
 * @param queuePeriodprovider 
 * @param asyncPerioddelivery 
 * @param httpPeriodconnPeriodtimeout 
 */
case class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(name: Option[ConfigNodePropertyString],
                title: Option[ConfigNodePropertyString],
                details: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                serviceName: Option[ConfigNodePropertyString],
                logPeriodlevel: Option[ConfigNodePropertyDropDown],
                allowedPeriodroots: Option[ConfigNodePropertyArray],
                queuePeriodprocessingPeriodenabled: Option[ConfigNodePropertyBoolean],
                packageImporterPeriodendpoints: Option[ConfigNodePropertyArray],
                passiveQueues: Option[ConfigNodePropertyArray],
                priorityQueues: Option[ConfigNodePropertyArray],
                retryPeriodstrategy: Option[ConfigNodePropertyDropDown],
                retryPeriodattempts: Option[ConfigNodePropertyInteger],
                requestAuthorizationStrategyPeriodtarget: Option[ConfigNodePropertyString],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString],
                triggersPeriodtarget: Option[ConfigNodePropertyString],
                queuePeriodprovider: Option[ConfigNodePropertyDropDown],
                asyncPerioddelivery: Option[ConfigNodePropertyBoolean],
                httpPeriodconnPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties] = deriveEncoder
}
