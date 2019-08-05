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
 * @param allowPeriodempty 
 * @param allowPeriodhosts 
 * @param allowPeriodhostsPeriodregexp 
 * @param filterPeriodmethods 
 * @param excludePeriodagentsPeriodregexp 
 */
case class OrgApacheSlingSecurityImplReferrerFilterProperties(allowPeriodempty: Option[ConfigNodePropertyBoolean],
                allowPeriodhosts: Option[ConfigNodePropertyArray],
                allowPeriodhostsPeriodregexp: Option[ConfigNodePropertyArray],
                filterPeriodmethods: Option[ConfigNodePropertyArray],
                excludePeriodagentsPeriodregexp: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingSecurityImplReferrerFilterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingSecurityImplReferrerFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingSecurityImplReferrerFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingSecurityImplReferrerFilterProperties] = deriveEncoder
}
