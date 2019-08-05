package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties]
                )

object ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo] = deriveEncoder
}
