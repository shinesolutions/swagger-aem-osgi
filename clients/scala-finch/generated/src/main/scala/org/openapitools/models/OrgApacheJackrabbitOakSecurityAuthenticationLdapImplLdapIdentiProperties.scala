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
 * @param providerPeriodname 
 * @param hostPeriodname 
 * @param hostPeriodport 
 * @param hostPeriodssl 
 * @param hostPeriodtls 
 * @param hostPeriodnoCertCheck 
 * @param bindPerioddn 
 * @param bindPeriodpassword 
 * @param searchTimeout 
 * @param adminPoolPeriodmaxActive 
 * @param adminPoolPeriodlookupOnValidate 
 * @param userPoolPeriodmaxActive 
 * @param userPoolPeriodlookupOnValidate 
 * @param userPeriodbaseDN 
 * @param userPeriodobjectclass 
 * @param userPeriodidAttribute 
 * @param userPeriodextraFilter 
 * @param userPeriodmakeDnPath 
 * @param groupPeriodbaseDN 
 * @param groupPeriodobjectclass 
 * @param groupPeriodnameAttribute 
 * @param groupPeriodextraFilter 
 * @param groupPeriodmakeDnPath 
 * @param groupPeriodmemberAttribute 
 * @param useUidForExtId 
 * @param customattributes 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(providerPeriodname: Option[ConfigNodePropertyString],
                hostPeriodname: Option[ConfigNodePropertyString],
                hostPeriodport: Option[ConfigNodePropertyInteger],
                hostPeriodssl: Option[ConfigNodePropertyBoolean],
                hostPeriodtls: Option[ConfigNodePropertyBoolean],
                hostPeriodnoCertCheck: Option[ConfigNodePropertyBoolean],
                bindPerioddn: Option[ConfigNodePropertyString],
                bindPeriodpassword: Option[ConfigNodePropertyString],
                searchTimeout: Option[ConfigNodePropertyString],
                adminPoolPeriodmaxActive: Option[ConfigNodePropertyInteger],
                adminPoolPeriodlookupOnValidate: Option[ConfigNodePropertyBoolean],
                userPoolPeriodmaxActive: Option[ConfigNodePropertyInteger],
                userPoolPeriodlookupOnValidate: Option[ConfigNodePropertyBoolean],
                userPeriodbaseDN: Option[ConfigNodePropertyString],
                userPeriodobjectclass: Option[ConfigNodePropertyArray],
                userPeriodidAttribute: Option[ConfigNodePropertyString],
                userPeriodextraFilter: Option[ConfigNodePropertyString],
                userPeriodmakeDnPath: Option[ConfigNodePropertyBoolean],
                groupPeriodbaseDN: Option[ConfigNodePropertyString],
                groupPeriodobjectclass: Option[ConfigNodePropertyArray],
                groupPeriodnameAttribute: Option[ConfigNodePropertyString],
                groupPeriodextraFilter: Option[ConfigNodePropertyString],
                groupPeriodmakeDnPath: Option[ConfigNodePropertyBoolean],
                groupPeriodmemberAttribute: Option[ConfigNodePropertyString],
                useUidForExtId: Option[ConfigNodePropertyBoolean],
                customattributes: Option[ConfigNodePropertyArray]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties] = deriveEncoder
}
