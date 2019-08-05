package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 */
case class ComDayCqDamCoreImplServletAssetDownloadServletProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletAssetDownloadServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletAssetDownloadServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletAssetDownloadServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletAssetDownloadServletProperties] = deriveEncoder
}
