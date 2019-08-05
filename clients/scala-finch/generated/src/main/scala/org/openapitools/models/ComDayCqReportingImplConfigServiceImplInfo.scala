package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReportingImplConfigServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReportingImplConfigServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReportingImplConfigServiceImplProperties]
                )

object ComDayCqReportingImplConfigServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqReportingImplConfigServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplConfigServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplConfigServiceImplInfo] = deriveEncoder
}
