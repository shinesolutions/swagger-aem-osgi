package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPerioddrmPeriodenable 
 */
case class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(cqPerioddamPerioddrmPeriodenable: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties] = deriveEncoder
}
