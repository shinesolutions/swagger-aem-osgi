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
 * @param alias 
 * @param davPeriodcreateMinusabsoluteMinusuri 
 * @param davPeriodprotectedhandlers 
 */
case class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(alias: Option[ConfigNodePropertyString],
                davPeriodcreateMinusabsoluteMinusuri: Option[ConfigNodePropertyBoolean],
                davPeriodprotectedhandlers: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties] = deriveEncoder
}
