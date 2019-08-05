package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties]
                )

object ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo] = deriveEncoder
}
