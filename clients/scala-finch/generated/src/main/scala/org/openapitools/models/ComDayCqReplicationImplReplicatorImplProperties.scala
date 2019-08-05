package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param distributeUnderscoreevents 
 */
case class ComDayCqReplicationImplReplicatorImplProperties(distributeUnderscoreevents: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqReplicationImplReplicatorImplProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReplicatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReplicatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReplicatorImplProperties] = deriveEncoder
}
