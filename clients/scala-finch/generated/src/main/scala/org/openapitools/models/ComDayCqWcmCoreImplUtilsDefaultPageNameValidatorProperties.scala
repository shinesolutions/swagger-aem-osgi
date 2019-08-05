package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param nonValidChars 
 */
case class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(nonValidChars: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties] = deriveEncoder
}
