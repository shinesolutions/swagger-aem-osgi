package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo] = deriveEncoder
}
