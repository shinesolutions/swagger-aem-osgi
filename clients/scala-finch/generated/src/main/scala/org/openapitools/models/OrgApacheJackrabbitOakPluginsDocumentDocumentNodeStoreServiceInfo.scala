package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties]
                )

object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo] = deriveEncoder
}
