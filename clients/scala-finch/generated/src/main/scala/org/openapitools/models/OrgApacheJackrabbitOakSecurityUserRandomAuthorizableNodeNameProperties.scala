package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param length 
 */
case class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(length: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties] = deriveEncoder
}
