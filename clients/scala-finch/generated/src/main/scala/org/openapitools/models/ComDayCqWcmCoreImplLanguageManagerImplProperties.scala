package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param langmgrPeriodlistPeriodpath 
 * @param langmgrPeriodcountryPerioddefault 
 */
case class ComDayCqWcmCoreImplLanguageManagerImplProperties(langmgrPeriodlistPeriodpath: Option[ConfigNodePropertyString],
                langmgrPeriodcountryPerioddefault: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplLanguageManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplLanguageManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplLanguageManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplLanguageManagerImplProperties] = deriveEncoder
}
