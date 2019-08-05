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
 * @param accepted 
 * @param ranked 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(accepted: Option[ConfigNodePropertyBoolean],
                ranked: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties] = deriveEncoder
}
