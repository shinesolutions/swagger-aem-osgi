package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties]
                )

object OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo] = deriveEncoder
}
