package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties] = deriveEncoder
}
