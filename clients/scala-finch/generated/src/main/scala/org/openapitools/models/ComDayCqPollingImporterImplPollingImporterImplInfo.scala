package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqPollingImporterImplPollingImporterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqPollingImporterImplPollingImporterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqPollingImporterImplPollingImporterImplProperties]
                )

object ComDayCqPollingImporterImplPollingImporterImplInfo {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplPollingImporterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplPollingImporterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplPollingImporterImplInfo] = deriveEncoder
}
