package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param priority 
 */
case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties(priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties] = deriveEncoder
}
