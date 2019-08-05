package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqContentsyncImplContentSyncManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqContentsyncImplContentSyncManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqContentsyncImplContentSyncManagerImplProperties]
                )

object ComDayCqContentsyncImplContentSyncManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqContentsyncImplContentSyncManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqContentsyncImplContentSyncManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqContentsyncImplContentSyncManagerImplInfo] = deriveEncoder
}
