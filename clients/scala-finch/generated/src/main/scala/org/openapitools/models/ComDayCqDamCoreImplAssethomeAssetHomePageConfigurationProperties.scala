package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param isEnabled 
 */
case class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties(isEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties] = deriveEncoder
}
