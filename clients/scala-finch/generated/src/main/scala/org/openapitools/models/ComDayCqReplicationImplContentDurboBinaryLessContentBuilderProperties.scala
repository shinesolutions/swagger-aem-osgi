package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param binaryPeriodthreshold 
 */
case class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(binaryPeriodthreshold: Option[ConfigNodePropertyInteger]
                )

object ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties] = deriveEncoder
}
