package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin 
 */
case class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties(cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties] = deriveEncoder
}
