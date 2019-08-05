package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsReferenceSearchServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsReferenceSearchServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties]
                )

object ComDayCqWcmCoreImplServletsReferenceSearchServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsReferenceSearchServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = deriveEncoder
}
