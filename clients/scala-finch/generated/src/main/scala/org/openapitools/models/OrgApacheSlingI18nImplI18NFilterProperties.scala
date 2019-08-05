package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param servicePeriodranking 
 * @param slingPeriodfilterPeriodscope 
 */
case class OrgApacheSlingI18nImplI18NFilterProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                slingPeriodfilterPeriodscope: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingI18nImplI18NFilterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingI18nImplI18NFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingI18nImplI18NFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingI18nImplI18NFilterProperties] = deriveEncoder
}
