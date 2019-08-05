package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxWaitTime 
 * @param minWaitBetweenRetries 
 */
case class ComAdobeCqSocialGroupImplGroupServiceImplProperties(maxWaitTime: Option[ConfigNodePropertyInteger],
                minWaitBetweenRetries: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialGroupImplGroupServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialGroupImplGroupServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialGroupImplGroupServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialGroupImplGroupServiceImplProperties] = deriveEncoder
}
