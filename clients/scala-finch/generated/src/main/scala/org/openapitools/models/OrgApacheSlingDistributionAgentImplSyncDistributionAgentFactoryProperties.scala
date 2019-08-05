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
 * @param passiveQueues 
 * @param packageExporterPeriodendpoints 
 * @param packageImporterPeriodendpoints 
 * @param retryPeriodstrategy 
 * @param retryPeriodattempts 
 * @param pullPerioditems 
 * @param httpPeriodconnPeriodtimeout 
 * @param requestAuthorizationStrategyPeriodtarget 
 * @param transportSecretProviderPeriodtarget 
 * @param packageBuilderPeriodtarget 
 * @param triggersPeriodtarget 
 */
case class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(name: Option[ConfigNodePropertyString],
                title: Option[ConfigNodePropertyString],
                details: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                serviceName: Option[ConfigNodePropertyString],
                logPeriodlevel: Option[ConfigNodePropertyDropDown],
                queuePeriodprocessingPeriodenabled: Option[ConfigNodePropertyBoolean],
                passiveQueues: Option[ConfigNodePropertyArray],
                packageExporterPeriodendpoints: Option[ConfigNodePropertyArray],
                packageImporterPeriodendpoints: Option[ConfigNodePropertyArray],
                retryPeriodstrategy: Option[ConfigNodePropertyDropDown],
                retryPeriodattempts: Option[ConfigNodePropertyInteger],
                pullPerioditems: Option[ConfigNodePropertyInteger],
                httpPeriodconnPeriodtimeout: Option[ConfigNodePropertyInteger],
                requestAuthorizationStrategyPeriodtarget: Option[ConfigNodePropertyString],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString],
                triggersPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties] = deriveEncoder
}
