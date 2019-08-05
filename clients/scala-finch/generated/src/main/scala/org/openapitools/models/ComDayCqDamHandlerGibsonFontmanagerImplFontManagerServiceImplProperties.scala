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
 * @param eventPeriodfilter 
 * @param fontmgrPeriodsystemPeriodfontPerioddir 
 * @param fontmgrPeriodadobePeriodfontPerioddir 
 * @param fontmgrPeriodcustomerPeriodfontPerioddir 
 */
case class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                fontmgrPeriodsystemPeriodfontPerioddir: Option[ConfigNodePropertyArray],
                fontmgrPeriodadobePeriodfontPerioddir: Option[ConfigNodePropertyString],
                fontmgrPeriodcustomerPeriodfontPerioddir: Option[ConfigNodePropertyString]
                )

object ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties] = deriveEncoder
}
