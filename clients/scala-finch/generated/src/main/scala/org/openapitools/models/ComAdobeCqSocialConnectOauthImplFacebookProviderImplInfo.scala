package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties]
                )

object ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = deriveEncoder
}
