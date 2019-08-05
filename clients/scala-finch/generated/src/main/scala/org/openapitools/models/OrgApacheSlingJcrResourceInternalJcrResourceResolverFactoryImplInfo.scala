package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo] = deriveEncoder
}
