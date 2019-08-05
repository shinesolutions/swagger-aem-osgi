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
 * @param firewallPerioddeserializationPeriodwhitelist 
 * @param firewallPerioddeserializationPeriodblacklist 
 * @param firewallPerioddeserializationPerioddiagnostics 
 */
case class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(firewallPerioddeserializationPeriodwhitelist: Option[ConfigNodePropertyArray],
                firewallPerioddeserializationPeriodblacklist: Option[ConfigNodePropertyArray],
                firewallPerioddeserializationPerioddiagnostics: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDeserfwImplDeserializationFirewallImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDeserfwImplDeserializationFirewallImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDeserfwImplDeserializationFirewallImplProperties] = deriveEncoder
}
