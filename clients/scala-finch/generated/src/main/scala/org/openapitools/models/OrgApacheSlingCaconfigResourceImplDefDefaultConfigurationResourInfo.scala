package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo] = deriveEncoder
}
