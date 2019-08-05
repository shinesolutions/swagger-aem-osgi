package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param solrPeriodhomePeriodpath 
 * @param solrPeriodcorePeriodname 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(solrPeriodhomePeriodpath: Option[ConfigNodePropertyString],
                solrPeriodcorePeriodname: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties] = deriveEncoder
}
