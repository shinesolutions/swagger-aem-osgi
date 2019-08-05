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
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops 
 * @param cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate 
 */
case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties] = deriveEncoder
}
