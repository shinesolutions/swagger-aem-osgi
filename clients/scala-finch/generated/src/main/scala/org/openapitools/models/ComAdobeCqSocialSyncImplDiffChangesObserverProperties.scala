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
 * @param enabled 
 * @param agentName 
 * @param diffPath 
 * @param propertyNames 
 */
case class ComAdobeCqSocialSyncImplDiffChangesObserverProperties(enabled: Option[ConfigNodePropertyBoolean],
                agentName: Option[ConfigNodePropertyString],
                diffPath: Option[ConfigNodePropertyString],
                propertyNames: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialSyncImplDiffChangesObserverProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplDiffChangesObserverProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplDiffChangesObserverProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplDiffChangesObserverProperties] = deriveEncoder
}
