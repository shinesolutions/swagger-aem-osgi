package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplServletDamContentDispositionFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplServletDamContentDispositionFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplServletDamContentDispositionFilterProperties]
                )

object ComDayCqDamCoreImplServletDamContentDispositionFilterInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletDamContentDispositionFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletDamContentDispositionFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletDamContentDispositionFilterInfo] = deriveEncoder
}
