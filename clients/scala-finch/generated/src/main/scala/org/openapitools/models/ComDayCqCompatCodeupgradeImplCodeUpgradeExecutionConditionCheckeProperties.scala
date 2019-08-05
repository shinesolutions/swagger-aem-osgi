package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param codeupgradetasks 
 * @param codeupgradetaskfilters 
 */
case class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(codeupgradetasks: Option[ConfigNodePropertyArray],
                codeupgradetaskfilters: Option[ConfigNodePropertyArray]
                )

object ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties] = deriveEncoder
}
