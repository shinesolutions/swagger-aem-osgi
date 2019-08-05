package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param scene7FlashTemplatesPeriodrti 
 * @param scene7FlashTemplatesPeriodrsi 
 * @param scene7FlashTemplatesPeriodrb 
 * @param scene7FlashTemplatesPeriodrurl 
 * @param scene7FlashTemplatePeriodurlFormatParameter 
 */
case class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(scene7FlashTemplatesPeriodrti: Option[ConfigNodePropertyString],
                scene7FlashTemplatesPeriodrsi: Option[ConfigNodePropertyString],
                scene7FlashTemplatesPeriodrb: Option[ConfigNodePropertyString],
                scene7FlashTemplatesPeriodrurl: Option[ConfigNodePropertyString],
                scene7FlashTemplatePeriodurlFormatParameter: Option[ConfigNodePropertyString]
                )

object ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties] = deriveEncoder
}
