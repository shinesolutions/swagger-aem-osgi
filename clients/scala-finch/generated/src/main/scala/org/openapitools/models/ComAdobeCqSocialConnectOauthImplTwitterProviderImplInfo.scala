package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties]
                )

object ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo] = deriveEncoder
}
