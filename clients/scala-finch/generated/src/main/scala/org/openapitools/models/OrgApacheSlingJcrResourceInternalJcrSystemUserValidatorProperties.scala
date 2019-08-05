package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param allowPeriodonlyPeriodsystemPerioduser 
 */
case class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(allowPeriodonlyPeriodsystemPerioduser: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties] = deriveEncoder
}
