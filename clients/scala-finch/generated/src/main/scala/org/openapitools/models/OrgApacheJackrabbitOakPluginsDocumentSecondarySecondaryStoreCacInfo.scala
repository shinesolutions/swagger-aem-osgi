package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties]
                )

object OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo] = deriveEncoder
}
