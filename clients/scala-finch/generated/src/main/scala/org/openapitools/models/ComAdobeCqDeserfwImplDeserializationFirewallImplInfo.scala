package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDeserfwImplDeserializationFirewallImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDeserfwImplDeserializationFirewallImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDeserfwImplDeserializationFirewallImplProperties]
                )

object ComAdobeCqDeserfwImplDeserializationFirewallImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDeserfwImplDeserializationFirewallImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = deriveEncoder
}
