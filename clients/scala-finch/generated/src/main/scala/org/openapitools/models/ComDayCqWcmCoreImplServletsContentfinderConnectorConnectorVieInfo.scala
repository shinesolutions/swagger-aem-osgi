package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties]
                )

object ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo] = deriveEncoder
}
