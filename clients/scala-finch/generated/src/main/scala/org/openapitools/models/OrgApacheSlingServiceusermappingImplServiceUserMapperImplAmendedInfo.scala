package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties]
                )

object OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo] = deriveEncoder
}
