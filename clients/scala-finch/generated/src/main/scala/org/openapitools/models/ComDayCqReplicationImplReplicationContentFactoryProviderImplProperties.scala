package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param replicationPeriodcontentPerioduseFileStorage 
 * @param replicationPeriodcontentPeriodmaxCommitAttempts 
 */
case class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(replicationPeriodcontentPerioduseFileStorage: Option[ConfigNodePropertyBoolean],
                replicationPeriodcontentPeriodmaxCommitAttempts: Option[ConfigNodePropertyInteger]
                )

object ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties] = deriveEncoder
}
