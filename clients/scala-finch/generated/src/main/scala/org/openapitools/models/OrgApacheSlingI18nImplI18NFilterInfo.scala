package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingI18nImplI18NFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingI18nImplI18NFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingI18nImplI18NFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingI18nImplI18NFilterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingI18nImplI18NFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingI18nImplI18NFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingI18nImplI18NFilterInfo] = deriveEncoder
}
