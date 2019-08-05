package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param servicePeriodranking 
 */
case class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties(servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties] = deriveEncoder
}
