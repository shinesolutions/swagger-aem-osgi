package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param schedulerPeriodperiod 
 */
case class ComDayCqReplicationImplReverseReplicatorProperties(schedulerPeriodperiod: Option[ConfigNodePropertyInteger]
                )

object ComDayCqReplicationImplReverseReplicatorProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReverseReplicatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReverseReplicatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReverseReplicatorProperties] = deriveEncoder
}
