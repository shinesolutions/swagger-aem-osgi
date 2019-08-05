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
 * @param activePeriodbyPerioddefault 
 * @param defaultPeriodmessage 
 */
case class OrgApacheSlingStartupfilterImplStartupFilterImplProperties(activePeriodbyPerioddefault: Option[ConfigNodePropertyBoolean],
                defaultPeriodmessage: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingStartupfilterImplStartupFilterImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingStartupfilterImplStartupFilterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingStartupfilterImplStartupFilterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingStartupfilterImplStartupFilterImplProperties] = deriveEncoder
}
