package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param slingPeriodservletPeriodresourceTypes 
 * @param slingPeriodservletPeriodmethods 
 * @param cqPerioddamPerioddrmPeriodenable 
 */
case class ComDayCqDamCoreImplServletBinaryProviderServletProperties(slingPeriodservletPeriodresourceTypes: Option[ConfigNodePropertyArray],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyArray],
                cqPerioddamPerioddrmPeriodenable: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletBinaryProviderServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletBinaryProviderServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletBinaryProviderServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletBinaryProviderServletProperties] = deriveEncoder
}
