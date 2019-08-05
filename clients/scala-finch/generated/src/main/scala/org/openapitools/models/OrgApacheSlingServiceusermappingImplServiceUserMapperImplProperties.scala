package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param userPeriodmapping 
 * @param userPerioddefault 
 * @param userPeriodenablePerioddefaultPeriodmapping 
 * @param requirePeriodvalidation 
 */
case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(userPeriodmapping: Option[ConfigNodePropertyArray],
                userPerioddefault: Option[ConfigNodePropertyString],
                userPeriodenablePerioddefaultPeriodmapping: Option[ConfigNodePropertyBoolean],
                requirePeriodvalidation: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties] = deriveEncoder
}
