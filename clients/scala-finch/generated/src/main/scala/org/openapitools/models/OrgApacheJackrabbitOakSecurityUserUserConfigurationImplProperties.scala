package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param usersPath 
 * @param groupsPath 
 * @param systemRelativePath 
 * @param defaultDepth 
 * @param importBehavior 
 * @param passwordHashAlgorithm 
 * @param passwordHashIterations 
 * @param passwordSaltSize 
 * @param omitAdminPw 
 * @param supportAutoSave 
 * @param passwordMaxAge 
 * @param initialPasswordChange 
 * @param passwordHistorySize 
 * @param passwordExpiryForAdmin 
 * @param cacheExpiration 
 * @param enableRFC7613UsercaseMappedProfile 
 */
case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(usersPath: Option[ConfigNodePropertyString],
                groupsPath: Option[ConfigNodePropertyString],
                systemRelativePath: Option[ConfigNodePropertyString],
                defaultDepth: Option[ConfigNodePropertyInteger],
                importBehavior: Option[ConfigNodePropertyDropDown],
                passwordHashAlgorithm: Option[ConfigNodePropertyString],
                passwordHashIterations: Option[ConfigNodePropertyInteger],
                passwordSaltSize: Option[ConfigNodePropertyInteger],
                omitAdminPw: Option[ConfigNodePropertyBoolean],
                supportAutoSave: Option[ConfigNodePropertyBoolean],
                passwordMaxAge: Option[ConfigNodePropertyInteger],
                initialPasswordChange: Option[ConfigNodePropertyBoolean],
                passwordHistorySize: Option[ConfigNodePropertyInteger],
                passwordExpiryForAdmin: Option[ConfigNodePropertyBoolean],
                cacheExpiration: Option[ConfigNodePropertyInteger],
                enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties] = deriveEncoder
}
