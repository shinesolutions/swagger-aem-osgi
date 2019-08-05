package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties]
                )

object OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo] = deriveEncoder
}
