package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param tempStorageConfig 
 */
case class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(tempStorageConfig: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {
    /**
     * Creates the codec for converting ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties] = deriveEncoder
}
