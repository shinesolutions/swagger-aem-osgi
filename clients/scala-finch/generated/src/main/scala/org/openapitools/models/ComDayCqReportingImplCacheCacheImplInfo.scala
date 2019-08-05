package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReportingImplCacheCacheImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReportingImplCacheCacheImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReportingImplCacheCacheImplProperties]
                )

object ComDayCqReportingImplCacheCacheImplInfo {
    /**
     * Creates the codec for converting ComDayCqReportingImplCacheCacheImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplCacheCacheImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplCacheCacheImplInfo] = deriveEncoder
}
