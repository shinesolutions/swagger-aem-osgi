package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param fieldWhitelist 
 */
case class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties(fieldWhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties] = deriveEncoder
}
