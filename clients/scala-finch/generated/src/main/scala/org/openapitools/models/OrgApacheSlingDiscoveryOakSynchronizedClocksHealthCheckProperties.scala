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
 * @param hcPeriodname 
 * @param hcPeriodtags 
 * @param hcPeriodmbeanPeriodname 
 */
case class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties] = deriveEncoder
}
