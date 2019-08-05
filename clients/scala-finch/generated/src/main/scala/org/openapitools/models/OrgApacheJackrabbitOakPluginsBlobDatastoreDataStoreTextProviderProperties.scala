package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param dir 
 */
case class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(dir: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties] = deriveEncoder
}
