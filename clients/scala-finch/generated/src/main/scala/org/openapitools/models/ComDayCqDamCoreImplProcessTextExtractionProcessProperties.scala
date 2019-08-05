package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param mimeTypes 
 * @param maxExtract 
 */
case class ComDayCqDamCoreImplProcessTextExtractionProcessProperties(mimeTypes: Option[ConfigNodePropertyArray],
                maxExtract: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplProcessTextExtractionProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplProcessTextExtractionProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplProcessTextExtractionProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplProcessTextExtractionProcessProperties] = deriveEncoder
}
