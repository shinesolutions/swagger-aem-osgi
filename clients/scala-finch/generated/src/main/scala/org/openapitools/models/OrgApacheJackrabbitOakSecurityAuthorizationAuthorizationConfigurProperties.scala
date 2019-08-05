package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param permissionsJr2 
 * @param importBehavior 
 * @param readPaths 
 * @param administrativePrincipals 
 * @param configurationRanking 
 */
case class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(permissionsJr2: Option[ConfigNodePropertyDropDown],
                importBehavior: Option[ConfigNodePropertyDropDown],
                readPaths: Option[ConfigNodePropertyArray],
                administrativePrincipals: Option[ConfigNodePropertyArray],
                configurationRanking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties] = deriveEncoder
}
