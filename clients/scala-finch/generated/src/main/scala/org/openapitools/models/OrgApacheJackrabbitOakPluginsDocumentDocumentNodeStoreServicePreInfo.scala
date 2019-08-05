package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo] = deriveEncoder
}
