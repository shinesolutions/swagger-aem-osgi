package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties]
                )

object ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo] = deriveEncoder
}
