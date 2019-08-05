package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties]
                )

object ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo] = deriveEncoder
}
