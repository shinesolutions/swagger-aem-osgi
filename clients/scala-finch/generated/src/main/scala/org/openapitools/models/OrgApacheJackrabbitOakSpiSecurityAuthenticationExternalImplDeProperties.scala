package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param handlerPeriodname 
 * @param userPeriodexpirationTime 
 * @param userPeriodautoMembership 
 * @param userPeriodpropertyMapping 
 * @param userPeriodpathPrefix 
 * @param userPeriodmembershipExpTime 
 * @param userPeriodmembershipNestingDepth 
 * @param userPerioddynamicMembership 
 * @param userPerioddisableMissing 
 * @param groupPeriodexpirationTime 
 * @param groupPeriodautoMembership 
 * @param groupPeriodpropertyMapping 
 * @param groupPeriodpathPrefix 
 * @param enableRFC7613UsercaseMappedProfile 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(handlerPeriodname: Option[ConfigNodePropertyString],
                userPeriodexpirationTime: Option[ConfigNodePropertyString],
                userPeriodautoMembership: Option[ConfigNodePropertyArray],
                userPeriodpropertyMapping: Option[ConfigNodePropertyArray],
                userPeriodpathPrefix: Option[ConfigNodePropertyString],
                userPeriodmembershipExpTime: Option[ConfigNodePropertyString],
                userPeriodmembershipNestingDepth: Option[ConfigNodePropertyInteger],
                userPerioddynamicMembership: Option[ConfigNodePropertyBoolean],
                userPerioddisableMissing: Option[ConfigNodePropertyBoolean],
                groupPeriodexpirationTime: Option[ConfigNodePropertyString],
                groupPeriodautoMembership: Option[ConfigNodePropertyArray],
                groupPeriodpropertyMapping: Option[ConfigNodePropertyArray],
                groupPeriodpathPrefix: Option[ConfigNodePropertyString],
                enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties] = deriveEncoder
}
