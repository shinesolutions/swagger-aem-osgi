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
 * @param osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodlistener 
 * @param authPeriodsudoPeriodcookie 
 * @param authPeriodsudoPeriodparameter 
 * @param authPeriodannonymous 
 * @param slingPeriodauthPeriodrequirements 
 * @param slingPeriodauthPeriodanonymousPerioduser 
 * @param slingPeriodauthPeriodanonymousPeriodpassword 
 * @param authPeriodhttp 
 * @param authPeriodhttpPeriodrealm 
 * @param authPerioduriPeriodsuffix 
 */
case class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodlistener: Option[ConfigNodePropertyString],
                authPeriodsudoPeriodcookie: Option[ConfigNodePropertyString],
                authPeriodsudoPeriodparameter: Option[ConfigNodePropertyString],
                authPeriodannonymous: Option[ConfigNodePropertyBoolean],
                slingPeriodauthPeriodrequirements: Option[ConfigNodePropertyArray],
                slingPeriodauthPeriodanonymousPerioduser: Option[ConfigNodePropertyString],
                slingPeriodauthPeriodanonymousPeriodpassword: Option[ConfigNodePropertyString],
                authPeriodhttp: Option[ConfigNodePropertyDropDown],
                authPeriodhttpPeriodrealm: Option[ConfigNodePropertyString],
                authPerioduriPeriodsuffix: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties] = deriveEncoder
}
