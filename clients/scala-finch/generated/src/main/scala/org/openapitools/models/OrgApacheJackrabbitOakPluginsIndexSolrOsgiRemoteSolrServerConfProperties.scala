package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param solrPeriodhttpPeriodurl 
 * @param solrPeriodzkPeriodhost 
 * @param solrPeriodcollection 
 * @param solrPeriodsocketPeriodtimeout 
 * @param solrPeriodconnectionPeriodtimeout 
 * @param solrPeriodshardsPeriodno 
 * @param solrPeriodreplicationPeriodfactor 
 * @param solrPeriodconfPerioddir 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(solrPeriodhttpPeriodurl: Option[ConfigNodePropertyString],
                solrPeriodzkPeriodhost: Option[ConfigNodePropertyString],
                solrPeriodcollection: Option[ConfigNodePropertyString],
                solrPeriodsocketPeriodtimeout: Option[ConfigNodePropertyInteger],
                solrPeriodconnectionPeriodtimeout: Option[ConfigNodePropertyInteger],
                solrPeriodshardsPeriodno: Option[ConfigNodePropertyInteger],
                solrPeriodreplicationPeriodfactor: Option[ConfigNodePropertyInteger],
                solrPeriodconfPerioddir: Option[ConfigNodePropertyString]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties] = deriveEncoder
}
