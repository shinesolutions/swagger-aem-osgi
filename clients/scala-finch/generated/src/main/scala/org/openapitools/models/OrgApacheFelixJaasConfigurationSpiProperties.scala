package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jaasPerioddefaultRealmName 
 * @param jaasPeriodconfigProviderName 
 * @param jaasPeriodglobalConfigPolicy 
 */
case class OrgApacheFelixJaasConfigurationSpiProperties(jaasPerioddefaultRealmName: Option[ConfigNodePropertyString],
                jaasPeriodconfigProviderName: Option[ConfigNodePropertyString],
                jaasPeriodglobalConfigPolicy: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheFelixJaasConfigurationSpiProperties {
    /**
     * Creates the codec for converting OrgApacheFelixJaasConfigurationSpiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixJaasConfigurationSpiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixJaasConfigurationSpiProperties] = deriveEncoder
}
