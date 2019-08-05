package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties]
                )

object ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo] = deriveEncoder
}
