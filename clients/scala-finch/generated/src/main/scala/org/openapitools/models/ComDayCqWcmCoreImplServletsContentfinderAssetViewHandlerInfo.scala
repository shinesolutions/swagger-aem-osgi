package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties]
                )

object ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo] = deriveEncoder
}
