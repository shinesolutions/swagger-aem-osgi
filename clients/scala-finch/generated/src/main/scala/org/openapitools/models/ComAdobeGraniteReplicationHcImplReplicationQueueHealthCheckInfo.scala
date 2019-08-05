package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties]
                )

object ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo] = deriveEncoder
}
