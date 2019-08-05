package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqStatisticsImplStatisticsServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqStatisticsImplStatisticsServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqStatisticsImplStatisticsServiceImplProperties]
                )

object ComDayCqStatisticsImplStatisticsServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqStatisticsImplStatisticsServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqStatisticsImplStatisticsServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqStatisticsImplStatisticsServiceImplInfo] = deriveEncoder
}
