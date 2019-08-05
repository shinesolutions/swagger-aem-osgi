package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = deriveEncoder
}
