package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties]
                )

object ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo] = deriveEncoder
}
