package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 */
case class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(path: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties] = deriveEncoder
}
