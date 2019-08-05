package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties]
                )

object ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo] = deriveEncoder
}
