package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingSecurityImplContentDispositionFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingSecurityImplContentDispositionFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingSecurityImplContentDispositionFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingSecurityImplContentDispositionFilterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingSecurityImplContentDispositionFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingSecurityImplContentDispositionFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingSecurityImplContentDispositionFilterInfo] = deriveEncoder
}
