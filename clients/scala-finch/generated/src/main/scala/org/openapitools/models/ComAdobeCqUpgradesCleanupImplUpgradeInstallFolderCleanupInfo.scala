package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties]
                )

object ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo {
    /**
     * Creates the codec for converting ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo] = deriveEncoder
}
