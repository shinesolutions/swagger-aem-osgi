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
 * @param _type 
 * @param formatPeriodtarget 
 * @param tempFsFolder 
 * @param fileThreshold 
 * @param memoryUnit 
 * @param useOffHeapMemory 
 * @param digestAlgorithm 
 * @param monitoringQueueSize 
 * @param cleanupDelay 
 * @param packagePeriodfilters 
 * @param propertyPeriodfilters 
 */
case class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(name: Option[ConfigNodePropertyString],
                _type: Option[ConfigNodePropertyDropDown],
                formatPeriodtarget: Option[ConfigNodePropertyString],
                tempFsFolder: Option[ConfigNodePropertyString],
                fileThreshold: Option[ConfigNodePropertyInteger],
                memoryUnit: Option[ConfigNodePropertyDropDown],
                useOffHeapMemory: Option[ConfigNodePropertyBoolean],
                digestAlgorithm: Option[ConfigNodePropertyDropDown],
                monitoringQueueSize: Option[ConfigNodePropertyInteger],
                cleanupDelay: Option[ConfigNodePropertyInteger],
                packagePeriodfilters: Option[ConfigNodePropertyArray],
                propertyPeriodfilters: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties] = deriveEncoder
}
