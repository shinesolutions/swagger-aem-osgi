package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplLanguageManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplLanguageManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplLanguageManagerImplProperties]
                )

object ComDayCqWcmCoreImplLanguageManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplLanguageManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplLanguageManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplLanguageManagerImplInfo] = deriveEncoder
}
