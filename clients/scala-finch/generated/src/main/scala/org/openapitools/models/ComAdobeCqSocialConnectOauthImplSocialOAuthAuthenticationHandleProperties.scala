package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 */
case class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(path: Option[ConfigNodePropertyArray],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties] = deriveEncoder
}
