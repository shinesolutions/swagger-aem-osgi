package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param packageRoots 
 */
case class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(packageRoots: Option[ConfigNodePropertyArray]
                )

object OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties] = deriveEncoder
}
