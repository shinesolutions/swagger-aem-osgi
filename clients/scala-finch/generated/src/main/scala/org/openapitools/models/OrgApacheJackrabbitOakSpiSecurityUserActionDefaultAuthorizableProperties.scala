package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enabledActions 
 * @param userPrivilegeNames 
 * @param groupPrivilegeNames 
 * @param constraint 
 */
case class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(enabledActions: Option[ConfigNodePropertyDropDown],
                userPrivilegeNames: Option[ConfigNodePropertyArray],
                groupPrivilegeNames: Option[ConfigNodePropertyArray],
                constraint: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties] = deriveEncoder
}
