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
 * @param largeUnderscorefileUnderscorethreshold 
 * @param largeUnderscorecommentUnderscorethreshold 
 * @param cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction 
 */
case class ComDayCqDamCommonsHandlerStandardImageHandlerProperties(largeUnderscorefileUnderscorethreshold: Option[ConfigNodePropertyInteger],
                largeUnderscorecommentUnderscorethreshold: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCommonsHandlerStandardImageHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsHandlerStandardImageHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsHandlerStandardImageHandlerProperties] = deriveEncoder
}
