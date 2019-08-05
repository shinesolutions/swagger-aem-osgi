package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param slingPeriodcontentPerioddispositionPeriodpaths 
 * @param slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths 
 * @param slingPeriodcontentPerioddispositionPeriodallPeriodpaths 
 */
case class OrgApacheSlingSecurityImplContentDispositionFilterProperties(slingPeriodcontentPerioddispositionPeriodpaths: Option[ConfigNodePropertyArray],
                slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths: Option[ConfigNodePropertyArray],
                slingPeriodcontentPerioddispositionPeriodallPeriodpaths: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingSecurityImplContentDispositionFilterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingSecurityImplContentDispositionFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingSecurityImplContentDispositionFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingSecurityImplContentDispositionFilterProperties] = deriveEncoder
}
