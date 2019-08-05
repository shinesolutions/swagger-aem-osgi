package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param accountName 
 * @param containerName 
 * @param accessKey 
 * @param rootPath 
 * @param connectionURL 
 */
case class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(accountName: Option[ConfigNodePropertyString],
                containerName: Option[ConfigNodePropertyString],
                accessKey: Option[ConfigNodePropertyString],
                rootPath: Option[ConfigNodePropertyString],
                connectionURL: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties] = deriveEncoder
}
