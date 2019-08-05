package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction 
 * @param largeUnderscorefileUnderscorethreshold 
 * @param largeUnderscorecommentUnderscorethreshold 
 */
case class ComDayCqDamCoreImplHandlerJpegHandlerProperties(cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction: Option[ConfigNodePropertyBoolean],
                largeUnderscorefileUnderscorethreshold: Option[ConfigNodePropertyInteger],
                largeUnderscorecommentUnderscorethreshold: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplHandlerJpegHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplHandlerJpegHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplHandlerJpegHandlerProperties] = deriveEncoder
}
