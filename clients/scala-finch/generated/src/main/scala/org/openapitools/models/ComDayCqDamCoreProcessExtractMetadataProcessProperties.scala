package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param processPeriodlabel 
 * @param cqPerioddamPeriodenablePeriodsha1 
 */
case class ComDayCqDamCoreProcessExtractMetadataProcessProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                cqPerioddamPeriodenablePeriodsha1: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreProcessExtractMetadataProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessExtractMetadataProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessExtractMetadataProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessExtractMetadataProcessProperties] = deriveEncoder
}
