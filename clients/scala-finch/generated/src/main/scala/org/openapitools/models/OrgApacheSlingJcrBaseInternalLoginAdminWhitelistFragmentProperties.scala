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
 * @param whitelistPeriodname 
 * @param whitelistPeriodbundles 
 */
case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(whitelistPeriodname: Option[ConfigNodePropertyString],
                whitelistPeriodbundles: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties] = deriveEncoder
}
