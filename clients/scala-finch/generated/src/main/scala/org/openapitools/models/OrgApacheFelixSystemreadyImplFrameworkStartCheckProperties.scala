package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param timeout 
 * @param targetPeriodstartPeriodlevel 
 * @param targetPeriodstartPeriodlevelPeriodpropPeriodname 
 * @param _type 
 */
case class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(timeout: Option[ConfigNodePropertyInteger],
                targetPeriodstartPeriodlevel: Option[ConfigNodePropertyInteger],
                targetPeriodstartPeriodlevelPeriodpropPeriodname: Option[ConfigNodePropertyString],
                _type: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties] = deriveEncoder
}
