package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param servicePeriodranking 
 * @param serviceusersPeriodsimpleSubjectPopulation 
 * @param serviceusersPeriodlist 
 */
case class ComAdobeGraniteRepositoryServiceUserConfigurationProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                serviceusersPeriodsimpleSubjectPopulation: Option[ConfigNodePropertyBoolean],
                serviceusersPeriodlist: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryServiceUserConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryServiceUserConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryServiceUserConfigurationProperties] = deriveEncoder
}
