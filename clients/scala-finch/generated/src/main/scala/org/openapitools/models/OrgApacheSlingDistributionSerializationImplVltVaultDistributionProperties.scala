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
 * @param importMode 
 * @param aclHandling 
 * @param packagePeriodroots 
 * @param packagePeriodfilters 
 * @param propertyPeriodfilters 
 * @param tempFsFolder 
 * @param useBinaryReferences 
 * @param autoSaveThreshold 
 * @param cleanupDelay 
 * @param fileThreshold 
 * @param MEGAUnderscoreBYTES 
 * @param useOffHeapMemory 
 * @param digestAlgorithm 
 * @param monitoringQueueSize 
 * @param pathsMapping 
 * @param strictImport 
 */
case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(name: Option[ConfigNodePropertyString],
                _type: Option[ConfigNodePropertyDropDown],
                importMode: Option[ConfigNodePropertyString],
                aclHandling: Option[ConfigNodePropertyString],
                packagePeriodroots: Option[ConfigNodePropertyString],
                packagePeriodfilters: Option[ConfigNodePropertyArray],
                propertyPeriodfilters: Option[ConfigNodePropertyArray],
                tempFsFolder: Option[ConfigNodePropertyString],
                useBinaryReferences: Option[ConfigNodePropertyBoolean],
                autoSaveThreshold: Option[ConfigNodePropertyInteger],
                cleanupDelay: Option[ConfigNodePropertyInteger],
                fileThreshold: Option[ConfigNodePropertyInteger],
                MEGAUnderscoreBYTES: Option[ConfigNodePropertyDropDown],
                useOffHeapMemory: Option[ConfigNodePropertyBoolean],
                digestAlgorithm: Option[ConfigNodePropertyDropDown],
                monitoringQueueSize: Option[ConfigNodePropertyInteger],
                pathsMapping: Option[ConfigNodePropertyArray],
                strictImport: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties] = deriveEncoder
}
