package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param servicesPeriodlist 
 * @param _type 
 */
case class OrgApacheFelixSystemreadyImplServicesCheckProperties(servicesPeriodlist: Option[ConfigNodePropertyArray],
                _type: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheFelixSystemreadyImplServicesCheckProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServicesCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServicesCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServicesCheckProperties] = deriveEncoder
}
