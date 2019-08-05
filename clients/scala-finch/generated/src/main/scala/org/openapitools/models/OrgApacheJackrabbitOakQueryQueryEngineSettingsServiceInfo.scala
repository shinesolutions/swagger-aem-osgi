package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties]
                )

object OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo] = deriveEncoder
}
