package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param ranking 
 * @param enable 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(ranking: Option[ConfigNodePropertyInteger],
                enable: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties] = deriveEncoder
}
