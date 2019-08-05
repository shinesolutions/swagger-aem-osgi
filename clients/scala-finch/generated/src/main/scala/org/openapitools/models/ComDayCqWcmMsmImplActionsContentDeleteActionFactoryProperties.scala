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
 */
case class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties] = deriveEncoder
}
