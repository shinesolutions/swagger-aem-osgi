package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties]
                )

object ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo] = deriveEncoder
}
