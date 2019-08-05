package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param queryLimitInMemory 
 * @param queryLimitReads 
 * @param queryFailTraversal 
 * @param fastQuerySize 
 */
case class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(queryLimitInMemory: Option[ConfigNodePropertyInteger],
                queryLimitReads: Option[ConfigNodePropertyInteger],
                queryFailTraversal: Option[ConfigNodePropertyBoolean],
                fastQuerySize: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties] = deriveEncoder
}
