package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties]
                )

object OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo] = deriveEncoder
}
