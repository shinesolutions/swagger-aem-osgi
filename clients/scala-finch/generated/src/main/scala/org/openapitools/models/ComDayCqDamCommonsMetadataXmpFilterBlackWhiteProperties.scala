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
 * @param xmpPeriodfilterPeriodapplyUnderscorewhitelist 
 * @param xmpPeriodfilterPeriodwhitelist 
 * @param xmpPeriodfilterPeriodapplyUnderscoreblacklist 
 * @param xmpPeriodfilterPeriodblacklist 
 */
case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(xmpPeriodfilterPeriodapplyUnderscorewhitelist: Option[ConfigNodePropertyBoolean],
                xmpPeriodfilterPeriodwhitelist: Option[ConfigNodePropertyArray],
                xmpPeriodfilterPeriodapplyUnderscoreblacklist: Option[ConfigNodePropertyBoolean],
                xmpPeriodfilterPeriodblacklist: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
    /**
     * Creates the codec for converting ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties] = deriveEncoder
}
