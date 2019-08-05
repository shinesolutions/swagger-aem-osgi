package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplUnzipUnzipConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplUnzipUnzipConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplUnzipUnzipConfigProperties]
                )

object ComDayCqDamCoreImplUnzipUnzipConfigInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplUnzipUnzipConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplUnzipUnzipConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplUnzipUnzipConfigInfo] = deriveEncoder
}
