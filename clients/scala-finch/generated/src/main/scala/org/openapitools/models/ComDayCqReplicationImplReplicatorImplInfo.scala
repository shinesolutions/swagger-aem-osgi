package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationImplReplicatorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReplicationImplReplicatorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationImplReplicatorImplProperties]
                )

object ComDayCqReplicationImplReplicatorImplInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReplicatorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReplicatorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReplicatorImplInfo] = deriveEncoder
}
