package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param requiredServicePids 
 * @param authorizationCompositionType 
 */
case class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(requiredServicePids: Option[ConfigNodePropertyArray],
                authorizationCompositionType: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties] = deriveEncoder
}
