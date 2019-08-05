package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationImplReverseReplicatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqReplicationImplReverseReplicatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationImplReverseReplicatorProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqReplicationImplReverseReplicatorInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReverseReplicatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReverseReplicatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReverseReplicatorInfo] = deriveEncoder
}
