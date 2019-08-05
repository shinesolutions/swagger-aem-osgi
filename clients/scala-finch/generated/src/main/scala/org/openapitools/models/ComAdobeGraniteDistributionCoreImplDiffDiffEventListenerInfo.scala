package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties]
                )

object ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo] = deriveEncoder
}
