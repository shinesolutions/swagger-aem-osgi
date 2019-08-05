package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties]
                )

object ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo] = deriveEncoder
}
