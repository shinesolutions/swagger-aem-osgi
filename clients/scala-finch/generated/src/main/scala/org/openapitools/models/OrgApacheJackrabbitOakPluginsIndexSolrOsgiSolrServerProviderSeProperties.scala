package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param serverPeriodtype 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(serverPeriodtype: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties] = deriveEncoder
}
