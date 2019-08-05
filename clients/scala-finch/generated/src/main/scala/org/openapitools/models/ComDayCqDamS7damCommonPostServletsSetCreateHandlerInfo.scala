package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties]
                )

object ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = deriveEncoder
}
