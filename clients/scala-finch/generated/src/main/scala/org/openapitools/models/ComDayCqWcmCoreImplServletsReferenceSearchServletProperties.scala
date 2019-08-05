package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param referencesearchservletPeriodmaxReferencesPerPage 
 * @param referencesearchservletPeriodmaxPages 
 */
case class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(referencesearchservletPeriodmaxReferencesPerPage: Option[ConfigNodePropertyInteger],
                referencesearchservletPeriodmaxPages: Option[ConfigNodePropertyInteger]
                )

object ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsReferenceSearchServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties] = deriveEncoder
}
