package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param deletePeriodnamePeriodregexps 
 */
case class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(deletePeriodnamePeriodregexps: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {
    /**
     * Creates the codec for converting ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties] = deriveEncoder
}
