package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties]
                )

object ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo] = deriveEncoder
}
