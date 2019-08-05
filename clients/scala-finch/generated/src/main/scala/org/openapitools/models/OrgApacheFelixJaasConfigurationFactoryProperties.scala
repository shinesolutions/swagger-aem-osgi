package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jaasPeriodcontrolFlag 
 * @param jaasPeriodranking 
 * @param jaasPeriodrealmName 
 * @param jaasPeriodclassname 
 * @param jaasPeriodoptions 
 */
case class OrgApacheFelixJaasConfigurationFactoryProperties(jaasPeriodcontrolFlag: Option[ConfigNodePropertyDropDown],
                jaasPeriodranking: Option[ConfigNodePropertyInteger],
                jaasPeriodrealmName: Option[ConfigNodePropertyString],
                jaasPeriodclassname: Option[ConfigNodePropertyString],
                jaasPeriodoptions: Option[ConfigNodePropertyArray]
                )

object OrgApacheFelixJaasConfigurationFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheFelixJaasConfigurationFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixJaasConfigurationFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixJaasConfigurationFactoryProperties] = deriveEncoder
}
