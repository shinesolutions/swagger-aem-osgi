package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param facebook 
 * @param twitter 
 * @param providerPeriodconfigPerioduserPeriodfolder 
 */
case class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(facebook: Option[ConfigNodePropertyArray],
                twitter: Option[ConfigNodePropertyArray],
                providerPeriodconfigPerioduserPeriodfolder: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties] = deriveEncoder
}
