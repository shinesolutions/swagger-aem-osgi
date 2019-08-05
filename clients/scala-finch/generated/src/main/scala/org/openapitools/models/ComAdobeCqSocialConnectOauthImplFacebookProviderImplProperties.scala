package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodproviderPeriodid 
 * @param oauthPeriodcloudPeriodconfigPeriodroot 
 * @param providerPeriodconfigPeriodroot 
 * @param providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled 
 * @param providerPeriodconfigPerioduserPeriodfolder 
 * @param providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields 
 * @param providerPeriodconfigPeriodfacebookPeriodfields 
 * @param providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled 
 */
case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodcloudPeriodconfigPeriodroot: Option[ConfigNodePropertyString],
                providerPeriodconfigPeriodroot: Option[ConfigNodePropertyString],
                providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled: Option[ConfigNodePropertyBoolean],
                providerPeriodconfigPerioduserPeriodfolder: Option[ConfigNodePropertyDropDown],
                providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields: Option[ConfigNodePropertyBoolean],
                providerPeriodconfigPeriodfacebookPeriodfields: Option[ConfigNodePropertyArray],
                providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties] = deriveEncoder
}
