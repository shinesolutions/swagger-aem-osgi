package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = deriveEncoder
}
