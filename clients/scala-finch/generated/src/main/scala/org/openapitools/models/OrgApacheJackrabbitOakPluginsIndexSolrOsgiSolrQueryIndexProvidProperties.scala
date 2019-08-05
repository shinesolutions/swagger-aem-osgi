package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param queryPeriodaggregation 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(queryPeriodaggregation: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties] = deriveEncoder
}
