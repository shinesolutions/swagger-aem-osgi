package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

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
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = deriveEncoder
}
