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
 * @param whitelistPeriodbypass 
 * @param whitelistPeriodbundlesPeriodregexp 
 */
case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(whitelistPeriodbypass: Option[ConfigNodePropertyBoolean],
                whitelistPeriodbundlesPeriodregexp: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties] = deriveEncoder
}
