package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param deletePeriodpathPeriodregexps 
 * @param deletePeriodsql2Periodquery 
 */
case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(deletePeriodpathPeriodregexps: Option[ConfigNodePropertyArray],
                deletePeriodsql2Periodquery: Option[ConfigNodePropertyString]
                )

object ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
    /**
     * Creates the codec for converting ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties] = deriveEncoder
}
