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
 * @param providerPeriodconfigPerioduserPeriodfolder 
 * @param providerPeriodconfigPeriodtwitterPeriodenablePeriodparams 
 * @param providerPeriodconfigPeriodtwitterPeriodparams 
 * @param providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled 
 */
case class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodcloudPeriodconfigPeriodroot: Option[ConfigNodePropertyString],
                providerPeriodconfigPeriodroot: Option[ConfigNodePropertyString],
                providerPeriodconfigPerioduserPeriodfolder: Option[ConfigNodePropertyDropDown],
                providerPeriodconfigPeriodtwitterPeriodenablePeriodparams: Option[ConfigNodePropertyBoolean],
                providerPeriodconfigPeriodtwitterPeriodparams: Option[ConfigNodePropertyArray],
                providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties] = deriveEncoder
}
