package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param activeRunModes 
 */
case class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(activeRunModes: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties] = deriveEncoder
}
