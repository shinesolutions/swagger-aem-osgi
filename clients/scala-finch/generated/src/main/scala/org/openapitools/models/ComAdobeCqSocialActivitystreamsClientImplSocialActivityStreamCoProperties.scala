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
case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties] = deriveEncoder
}
