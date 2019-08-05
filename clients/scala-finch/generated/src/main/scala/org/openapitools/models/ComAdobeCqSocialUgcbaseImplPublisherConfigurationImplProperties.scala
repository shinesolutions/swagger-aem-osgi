package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param isPrimaryPublisher 
 */
case class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(isPrimaryPublisher: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties] = deriveEncoder
}
