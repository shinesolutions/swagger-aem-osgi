package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties]
                )

object ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo {
    /**
     * Creates the codec for converting ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo] = deriveEncoder
}
