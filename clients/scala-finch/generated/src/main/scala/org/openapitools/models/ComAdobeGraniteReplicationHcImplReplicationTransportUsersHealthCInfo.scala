package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties]
                )

object ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo] = deriveEncoder
}
