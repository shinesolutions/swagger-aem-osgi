package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties]
                )

object ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo] = deriveEncoder
}
