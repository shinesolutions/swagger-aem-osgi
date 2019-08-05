package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param More Info 
 * @param SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket 
 */
case class ComDayCqDamCoreImplServletCompanionServletProperties(More Info: Option[ConfigNodePropertyString],
                SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplServletCompanionServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCompanionServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCompanionServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCompanionServletProperties] = deriveEncoder
}
