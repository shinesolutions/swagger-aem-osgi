package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties]
                )

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo] = deriveEncoder
}
