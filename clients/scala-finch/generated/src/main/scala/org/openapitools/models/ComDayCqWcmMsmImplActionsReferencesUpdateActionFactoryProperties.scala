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
 * @param cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested 
 */
case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = deriveEncoder
}
