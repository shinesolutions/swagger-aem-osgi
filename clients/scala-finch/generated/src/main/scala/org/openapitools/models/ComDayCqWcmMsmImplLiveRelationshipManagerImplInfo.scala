package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties]
                )

object ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = deriveEncoder
}
