package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param defaultPeriodexternalizerPerioddomain 
 */
case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(defaultPeriodexternalizerPerioddomain: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties] = deriveEncoder
}
