package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo] = deriveEncoder
}
