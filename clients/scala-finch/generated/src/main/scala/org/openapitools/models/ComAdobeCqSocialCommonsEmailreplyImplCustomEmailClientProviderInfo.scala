package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo] = deriveEncoder
}
