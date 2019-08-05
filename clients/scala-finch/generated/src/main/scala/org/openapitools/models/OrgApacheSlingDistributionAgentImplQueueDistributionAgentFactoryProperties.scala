package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
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
 * @param requestAuthorizationStrategyPeriodtarget 
 * @param queueProviderFactoryPeriodtarget 
 * @param packageBuilderPeriodtarget 
 * @param triggersPeriodtarget 
 * @param priorityQueues 
 */
case class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(name: Option[ConfigNodePropertyString],
                title: Option[ConfigNodePropertyString],
                details: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                serviceName: Option[ConfigNodePropertyString],
                logPeriodlevel: Option[ConfigNodePropertyDropDown],
                allowedPeriodroots: Option[ConfigNodePropertyArray],
                requestAuthorizationStrategyPeriodtarget: Option[ConfigNodePropertyString],
                queueProviderFactoryPeriodtarget: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString],
                triggersPeriodtarget: Option[ConfigNodePropertyString],
                priorityQueues: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties] = deriveEncoder
}
