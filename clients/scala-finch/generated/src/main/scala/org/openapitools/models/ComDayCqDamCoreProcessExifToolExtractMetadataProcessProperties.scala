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
case class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                cqPerioddamPeriodenablePeriodsha1: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties] = deriveEncoder
}
