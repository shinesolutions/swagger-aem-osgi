package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param itemPeriodresourcePeriodtypes 
 */
case class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(itemPeriodresourcePeriodtypes: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties] = deriveEncoder
}
