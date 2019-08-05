package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingXssImplXSSFilterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingXssImplXSSFilterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingXssImplXSSFilterImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingXssImplXSSFilterImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingXssImplXSSFilterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingXssImplXSSFilterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingXssImplXSSFilterImplInfo] = deriveEncoder
}
