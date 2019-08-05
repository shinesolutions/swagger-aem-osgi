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
 * @param damPeriodshowexpired 
 * @param damPeriodshowhidden 
 * @param tagTitleSearch 
 * @param guessTotal 
 * @param damPeriodexpiryProperty 
 */
case class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(damPeriodshowexpired: Option[ConfigNodePropertyBoolean],
                damPeriodshowhidden: Option[ConfigNodePropertyBoolean],
                tagTitleSearch: Option[ConfigNodePropertyBoolean],
                guessTotal: Option[ConfigNodePropertyString],
                damPeriodexpiryProperty: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties] = deriveEncoder
}
