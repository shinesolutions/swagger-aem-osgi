package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo] = deriveEncoder
}
