package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = deriveEncoder
}
