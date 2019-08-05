package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param providerName 
 * @param forwardPeriodrequests 
 */
case class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(providerName: Option[ConfigNodePropertyString],
                forwardPeriodrequests: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties] = deriveEncoder
}
