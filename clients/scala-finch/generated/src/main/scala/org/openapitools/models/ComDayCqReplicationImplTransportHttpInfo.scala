package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationImplTransportHttpProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReplicationImplTransportHttpInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationImplTransportHttpProperties]
                )

object ComDayCqReplicationImplTransportHttpInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationImplTransportHttpInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplTransportHttpInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplTransportHttpInfo] = deriveEncoder
}
