package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param upgradeTaskIgnoreList 
 */
case class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(upgradeTaskIgnoreList: Option[ConfigNodePropertyArray]
                )

object ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties] = deriveEncoder
}
