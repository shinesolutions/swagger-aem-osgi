package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo] = deriveEncoder
}
