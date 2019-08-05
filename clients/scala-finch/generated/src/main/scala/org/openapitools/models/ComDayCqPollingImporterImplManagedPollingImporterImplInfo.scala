package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqPollingImporterImplManagedPollingImporterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqPollingImporterImplManagedPollingImporterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqPollingImporterImplManagedPollingImporterImplProperties]
                )

object ComDayCqPollingImporterImplManagedPollingImporterImplInfo {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplManagedPollingImporterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplManagedPollingImporterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplManagedPollingImporterImplInfo] = deriveEncoder
}
