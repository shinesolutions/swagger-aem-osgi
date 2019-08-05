package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodmimePeriodtypePeriodblacklist 
 * @param cqPerioddamPeriodemptyPeriodmime 
 */
case class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(cqPeriodmimePeriodtypePeriodblacklist: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodemptyPeriodmime: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletDamContentDispositionFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletDamContentDispositionFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletDamContentDispositionFilterProperties] = deriveEncoder
}
