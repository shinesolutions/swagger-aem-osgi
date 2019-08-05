package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodname 
 * @param slingPerioddescription 
 */
case class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(slingPeriodname: Option[ConfigNodePropertyString],
                slingPerioddescription: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties] = deriveEncoder
}
