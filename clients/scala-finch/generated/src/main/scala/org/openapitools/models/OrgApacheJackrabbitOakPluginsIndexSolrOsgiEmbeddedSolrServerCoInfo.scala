package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo] = deriveEncoder
}
