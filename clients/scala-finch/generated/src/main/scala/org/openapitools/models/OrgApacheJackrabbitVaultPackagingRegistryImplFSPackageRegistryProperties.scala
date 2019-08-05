package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param homePath 
 */
case class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(homePath: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties] = deriveEncoder
}
