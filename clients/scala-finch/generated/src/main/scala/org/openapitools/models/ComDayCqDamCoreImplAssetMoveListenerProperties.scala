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
case class ComDayCqDamCoreImplAssetMoveListenerProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplAssetMoveListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAssetMoveListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAssetMoveListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAssetMoveListenerProperties] = deriveEncoder
}
