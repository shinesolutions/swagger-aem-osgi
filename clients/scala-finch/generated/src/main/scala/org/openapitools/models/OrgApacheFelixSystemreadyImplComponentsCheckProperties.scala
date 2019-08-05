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
 * @param componentsPeriodlist 
 * @param _type 
 */
case class OrgApacheFelixSystemreadyImplComponentsCheckProperties(componentsPeriodlist: Option[ConfigNodePropertyArray],
                _type: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheFelixSystemreadyImplComponentsCheckProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplComponentsCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplComponentsCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplComponentsCheckProperties] = deriveEncoder
}
