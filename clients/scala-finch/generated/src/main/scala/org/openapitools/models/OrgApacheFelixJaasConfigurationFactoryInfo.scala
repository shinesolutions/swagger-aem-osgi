package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixJaasConfigurationFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixJaasConfigurationFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixJaasConfigurationFactoryProperties]
                )

object OrgApacheFelixJaasConfigurationFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheFelixJaasConfigurationFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixJaasConfigurationFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixJaasConfigurationFactoryInfo] = deriveEncoder
}
