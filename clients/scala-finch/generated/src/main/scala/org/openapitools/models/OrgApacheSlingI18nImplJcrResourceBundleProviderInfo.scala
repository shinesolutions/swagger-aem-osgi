package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingI18nImplJcrResourceBundleProviderInfo {
    /**
     * Creates the codec for converting OrgApacheSlingI18nImplJcrResourceBundleProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = deriveEncoder
}
