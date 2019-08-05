package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param preMinusupgradePeriodmaintenancePeriodtasks 
 * @param preMinusupgradePeriodhcPeriodtags 
 */
case class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(preMinusupgradePeriodmaintenancePeriodtasks: Option[ConfigNodePropertyArray],
                preMinusupgradePeriodhcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    /**
     * Creates the codec for converting ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties] = deriveEncoder
}
