package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixJaasConfigurationSpiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheFelixJaasConfigurationSpiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixJaasConfigurationSpiProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheFelixJaasConfigurationSpiInfo {
    /**
     * Creates the codec for converting OrgApacheFelixJaasConfigurationSpiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixJaasConfigurationSpiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixJaasConfigurationSpiInfo] = deriveEncoder
}
