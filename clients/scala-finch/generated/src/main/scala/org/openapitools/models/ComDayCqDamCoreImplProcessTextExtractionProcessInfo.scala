package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplProcessTextExtractionProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplProcessTextExtractionProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplProcessTextExtractionProcessProperties]
                )

object ComDayCqDamCoreImplProcessTextExtractionProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplProcessTextExtractionProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = deriveEncoder
}
