package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 * @param schedulerPeriodconcurrent 
 * @param chunkPeriodcleanupPeriodage 
 */
case class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                schedulerPeriodconcurrent: Option[ConfigNodePropertyBoolean],
                chunkPeriodcleanupPeriodage: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = deriveEncoder
}
