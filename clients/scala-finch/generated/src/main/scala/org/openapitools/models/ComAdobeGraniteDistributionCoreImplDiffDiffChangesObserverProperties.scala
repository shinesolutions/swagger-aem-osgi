package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enabled 
 * @param agentName 
 * @param diffPath 
 * @param observedPath 
 * @param serviceName 
 * @param propertyNames 
 * @param distributionDelay 
 * @param serviceUserPeriodtarget 
 */
case class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(enabled: Option[ConfigNodePropertyBoolean],
                agentName: Option[ConfigNodePropertyString],
                diffPath: Option[ConfigNodePropertyString],
                observedPath: Option[ConfigNodePropertyString],
                serviceName: Option[ConfigNodePropertyString],
                propertyNames: Option[ConfigNodePropertyString],
                distributionDelay: Option[ConfigNodePropertyInteger],
                serviceUserPeriodtarget: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties] = deriveEncoder
}
