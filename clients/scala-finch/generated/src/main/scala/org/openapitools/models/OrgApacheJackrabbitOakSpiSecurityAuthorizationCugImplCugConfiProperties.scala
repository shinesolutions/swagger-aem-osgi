package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cugSupportedPaths 
 * @param cugEnabled 
 * @param configurationRanking 
 */
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(cugSupportedPaths: Option[ConfigNodePropertyArray],
                cugEnabled: Option[ConfigNodePropertyBoolean],
                configurationRanking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties] = deriveEncoder
}
