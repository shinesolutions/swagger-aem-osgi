package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo] = deriveEncoder
}
