package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingResourcemergerPickerOverridingProperties

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
case class OrgApacheSlingResourcemergerPickerOverridingInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingResourcemergerPickerOverridingProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingResourcemergerPickerOverridingInfo {
    /**
     * Creates the codec for converting OrgApacheSlingResourcemergerPickerOverridingInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingResourcemergerPickerOverridingInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingResourcemergerPickerOverridingInfo] = deriveEncoder
}
