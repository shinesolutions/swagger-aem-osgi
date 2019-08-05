package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servletPeriodpostPerioddateFormats 
 * @param servletPeriodpostPeriodnodeNameHints 
 * @param servletPeriodpostPeriodnodeNameMaxLength 
 * @param servletPeriodpostPeriodcheckinNewVersionableNodes 
 * @param servletPeriodpostPeriodautoCheckout 
 * @param servletPeriodpostPeriodautoCheckin 
 * @param servletPeriodpostPeriodignorePattern 
 */
case class OrgApacheSlingServletsPostImplSlingPostServletProperties(servletPeriodpostPerioddateFormats: Option[ConfigNodePropertyArray],
                servletPeriodpostPeriodnodeNameHints: Option[ConfigNodePropertyArray],
                servletPeriodpostPeriodnodeNameMaxLength: Option[ConfigNodePropertyInteger],
                servletPeriodpostPeriodcheckinNewVersionableNodes: Option[ConfigNodePropertyBoolean],
                servletPeriodpostPeriodautoCheckout: Option[ConfigNodePropertyBoolean],
                servletPeriodpostPeriodautoCheckin: Option[ConfigNodePropertyBoolean],
                servletPeriodpostPeriodignorePattern: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingServletsPostImplSlingPostServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServletsPostImplSlingPostServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsPostImplSlingPostServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsPostImplSlingPostServletProperties] = deriveEncoder
}
