package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties]
                )

object OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo] = deriveEncoder
}
