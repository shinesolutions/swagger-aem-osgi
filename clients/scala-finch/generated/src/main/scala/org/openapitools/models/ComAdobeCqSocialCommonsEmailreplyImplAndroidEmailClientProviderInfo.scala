package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties]
                )

object ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo] = deriveEncoder
}
