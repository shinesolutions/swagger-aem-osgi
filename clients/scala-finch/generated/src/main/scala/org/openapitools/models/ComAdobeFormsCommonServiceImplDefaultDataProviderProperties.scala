package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param alloweddataFileLocations 
 */
case class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(alloweddataFileLocations: Option[ConfigNodePropertyArray]
                )

object ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {
    /**
     * Creates the codec for converting ComAdobeFormsCommonServiceImplDefaultDataProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFormsCommonServiceImplDefaultDataProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFormsCommonServiceImplDefaultDataProviderProperties] = deriveEncoder
}
