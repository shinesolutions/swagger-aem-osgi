package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param host 
 * @param port 
 */
case class ComDayCqReplicationContentStaticContentBuilderProperties(host: Option[ConfigNodePropertyString],
                port: Option[ConfigNodePropertyInteger]
                )

object ComDayCqReplicationContentStaticContentBuilderProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationContentStaticContentBuilderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationContentStaticContentBuilderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationContentStaticContentBuilderProperties] = deriveEncoder
}
