package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param namePeriodwhitelist 
 * @param allowPeriodexpressions 
 */
case class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(namePeriodwhitelist: Option[ConfigNodePropertyString],
                allowPeriodexpressions: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties] = deriveEncoder
}
