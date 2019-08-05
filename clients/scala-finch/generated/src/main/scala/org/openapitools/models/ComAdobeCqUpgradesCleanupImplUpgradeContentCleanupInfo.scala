package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties]
                )

object ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo {
    /**
     * Creates the codec for converting ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = deriveEncoder
}
