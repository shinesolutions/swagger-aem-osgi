package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param tokenExpiration 
 * @param tokenLength 
 * @param tokenRefresh 
 * @param tokenCleanupThreshold 
 * @param passwordHashAlgorithm 
 * @param passwordHashIterations 
 * @param passwordSaltSize 
 */
case class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(tokenExpiration: Option[ConfigNodePropertyString],
                tokenLength: Option[ConfigNodePropertyString],
                tokenRefresh: Option[ConfigNodePropertyBoolean],
                tokenCleanupThreshold: Option[ConfigNodePropertyInteger],
                passwordHashAlgorithm: Option[ConfigNodePropertyString],
                passwordHashIterations: Option[ConfigNodePropertyInteger],
                passwordSaltSize: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties] = deriveEncoder
}
