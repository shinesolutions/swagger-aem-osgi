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
case class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties(fieldWhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties] = deriveEncoder
}
