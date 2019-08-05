package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodresourceTypes 
 * @param slingPeriodservletPeriodmethods 
 * @param slingPeriodservletPeriodextensions 
 * @param slingPeriodservletPeriodselectors 
 */
case class ComDayCqDamCoreImplServletMetadataGetServletProperties(slingPeriodservletPeriodresourceTypes: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodextensions: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplServletMetadataGetServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletMetadataGetServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletMetadataGetServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletMetadataGetServletProperties] = deriveEncoder
}
