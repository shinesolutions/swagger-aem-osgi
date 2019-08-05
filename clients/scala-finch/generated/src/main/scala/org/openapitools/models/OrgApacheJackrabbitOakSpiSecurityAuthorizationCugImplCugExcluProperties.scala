package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param principalNames 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(principalNames: Option[ConfigNodePropertyArray]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties] = deriveEncoder
}
