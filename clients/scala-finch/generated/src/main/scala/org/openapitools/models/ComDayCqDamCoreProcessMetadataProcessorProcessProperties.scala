package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param processPeriodlabel 
 * @param cqPerioddamPeriodenablePeriodsha1 
 * @param cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties 
 */
case class ComDayCqDamCoreProcessMetadataProcessorProcessProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                cqPerioddamPeriodenablePeriodsha1: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreProcessMetadataProcessorProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessMetadataProcessorProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessMetadataProcessorProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessMetadataProcessorProcessProperties] = deriveEncoder
}
