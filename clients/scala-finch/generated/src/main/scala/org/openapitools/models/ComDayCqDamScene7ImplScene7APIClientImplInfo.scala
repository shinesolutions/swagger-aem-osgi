package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamScene7ImplScene7APIClientImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamScene7ImplScene7APIClientImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamScene7ImplScene7APIClientImplProperties]
                )

object ComDayCqDamScene7ImplScene7APIClientImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7APIClientImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7APIClientImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7APIClientImplInfo] = deriveEncoder
}
