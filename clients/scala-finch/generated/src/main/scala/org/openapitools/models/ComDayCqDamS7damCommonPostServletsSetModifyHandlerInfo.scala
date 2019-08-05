package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties]
                )

object ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = deriveEncoder
}
