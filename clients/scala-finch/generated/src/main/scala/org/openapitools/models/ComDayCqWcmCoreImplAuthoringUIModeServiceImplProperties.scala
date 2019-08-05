package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param authoringUIModeServicePerioddefault 
 */
case class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(authoringUIModeServicePerioddefault: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties] = deriveEncoder
}
