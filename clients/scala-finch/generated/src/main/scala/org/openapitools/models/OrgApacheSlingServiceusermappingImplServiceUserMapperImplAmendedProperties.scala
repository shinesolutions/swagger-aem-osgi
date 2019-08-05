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
 * @param userPeriodmapping 
 */
case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                userPeriodmapping: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties] = deriveEncoder
}
