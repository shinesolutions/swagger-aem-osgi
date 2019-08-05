package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo] = deriveEncoder
}
