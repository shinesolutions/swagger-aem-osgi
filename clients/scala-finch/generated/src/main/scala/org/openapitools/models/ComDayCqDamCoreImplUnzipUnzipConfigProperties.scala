package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize 
 * @param cqPerioddamPeriodconfigPeriodunzipPeriodencoding 
 */
case class ComDayCqDamCoreImplUnzipUnzipConfigProperties(cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodunzipPeriodencoding: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplUnzipUnzipConfigProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplUnzipUnzipConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = deriveEncoder
}
