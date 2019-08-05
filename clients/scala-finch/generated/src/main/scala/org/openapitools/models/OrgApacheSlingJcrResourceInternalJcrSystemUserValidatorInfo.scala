package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties]
                )

object OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo] = deriveEncoder
}
