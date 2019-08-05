package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param javaPeriodnamingPeriodfactoryPeriodinitial 
 * @param javaPeriodnamingPeriodproviderPeriodurl 
 */
case class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(javaPeriodnamingPeriodfactoryPeriodinitial: Option[ConfigNodePropertyString],
                javaPeriodnamingPeriodproviderPeriodurl: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties] = deriveEncoder
}
