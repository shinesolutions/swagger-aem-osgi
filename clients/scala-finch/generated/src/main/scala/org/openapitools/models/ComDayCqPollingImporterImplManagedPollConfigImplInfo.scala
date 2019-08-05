package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqPollingImporterImplManagedPollConfigImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqPollingImporterImplManagedPollConfigImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqPollingImporterImplManagedPollConfigImplProperties]
                )

object ComDayCqPollingImporterImplManagedPollConfigImplInfo {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplManagedPollConfigImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplManagedPollConfigImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplManagedPollConfigImplInfo] = deriveEncoder
}
