package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties]
                )

object OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo] = deriveEncoder
}
