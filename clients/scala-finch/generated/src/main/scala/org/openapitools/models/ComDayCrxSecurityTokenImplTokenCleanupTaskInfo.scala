package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCrxSecurityTokenImplTokenCleanupTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCrxSecurityTokenImplTokenCleanupTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties]
                )

object ComDayCrxSecurityTokenImplTokenCleanupTaskInfo {
    /**
     * Creates the codec for converting ComDayCrxSecurityTokenImplTokenCleanupTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = deriveEncoder
}
