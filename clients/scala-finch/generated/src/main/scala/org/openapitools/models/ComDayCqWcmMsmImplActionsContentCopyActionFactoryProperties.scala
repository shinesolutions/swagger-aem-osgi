package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems 
 * @param cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops 
 * @param contentcopyactionPeriodorderPeriodstyle 
 */
case class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Option[ConfigNodePropertyArray],
                contentcopyactionPeriodorderPeriodstyle: Option[ConfigNodePropertyDropDown]
                )

object ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties] = deriveEncoder
}
