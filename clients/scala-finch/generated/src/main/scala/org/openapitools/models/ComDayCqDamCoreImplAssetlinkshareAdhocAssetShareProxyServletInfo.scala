package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties]
                )

object ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo] = deriveEncoder
}
