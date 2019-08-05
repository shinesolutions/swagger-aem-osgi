package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties]
                )

object OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo] = deriveEncoder
}
