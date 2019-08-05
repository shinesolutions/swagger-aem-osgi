package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties] = deriveEncoder
}
