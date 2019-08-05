package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties]
                )

object ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo] = deriveEncoder
}
