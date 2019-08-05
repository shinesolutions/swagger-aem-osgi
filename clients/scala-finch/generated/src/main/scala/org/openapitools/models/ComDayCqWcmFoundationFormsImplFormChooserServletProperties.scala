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
 * @param servicePeriodname 
 * @param slingPeriodservletPeriodresourceTypes 
 * @param slingPeriodservletPeriodselectors 
 * @param slingPeriodservletPeriodmethods 
 * @param formsPeriodformchooserservletPeriodadvansesearchPeriodrequire 
 */
case class ComDayCqWcmFoundationFormsImplFormChooserServletProperties(servicePeriodname: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodresourceTypes: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyArray],
                formsPeriodformchooserservletPeriodadvansesearchPeriodrequire: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormChooserServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormChooserServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormChooserServletProperties] = deriveEncoder
}
