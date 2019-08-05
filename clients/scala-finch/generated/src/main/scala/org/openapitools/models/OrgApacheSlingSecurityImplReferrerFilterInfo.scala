package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingSecurityImplReferrerFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingSecurityImplReferrerFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingSecurityImplReferrerFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingSecurityImplReferrerFilterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingSecurityImplReferrerFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingSecurityImplReferrerFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingSecurityImplReferrerFilterInfo] = deriveEncoder
}
