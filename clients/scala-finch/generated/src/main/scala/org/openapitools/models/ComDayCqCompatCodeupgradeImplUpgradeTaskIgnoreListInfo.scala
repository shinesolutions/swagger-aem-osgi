package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties]
                )

object ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = deriveEncoder
}
