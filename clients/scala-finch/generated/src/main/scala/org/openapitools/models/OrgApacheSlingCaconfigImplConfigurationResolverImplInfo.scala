package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplConfigurationResolverImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCaconfigImplConfigurationResolverImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplConfigurationResolverImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCaconfigImplConfigurationResolverImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplConfigurationResolverImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = deriveEncoder
}
