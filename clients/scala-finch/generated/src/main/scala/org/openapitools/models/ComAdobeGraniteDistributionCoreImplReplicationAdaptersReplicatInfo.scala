package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties]
                )

object ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo] = deriveEncoder
}
