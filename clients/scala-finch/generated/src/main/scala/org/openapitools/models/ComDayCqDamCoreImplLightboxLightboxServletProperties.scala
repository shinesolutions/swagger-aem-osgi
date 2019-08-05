package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodpaths 
 * @param slingPeriodservletPeriodmethods 
 * @param cqPerioddamPeriodenablePeriodanonymous 
 */
case class ComDayCqDamCoreImplLightboxLightboxServletProperties(slingPeriodservletPeriodpaths: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodenablePeriodanonymous: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplLightboxLightboxServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplLightboxLightboxServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplLightboxLightboxServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplLightboxLightboxServletProperties] = deriveEncoder
}
