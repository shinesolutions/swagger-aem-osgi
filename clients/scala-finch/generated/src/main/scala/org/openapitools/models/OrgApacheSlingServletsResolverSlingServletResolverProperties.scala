package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servletresolverPeriodservletRoot 
 * @param servletresolverPeriodcacheSize 
 * @param servletresolverPeriodpaths 
 * @param servletresolverPerioddefaultExtensions 
 */
case class OrgApacheSlingServletsResolverSlingServletResolverProperties(servletresolverPeriodservletRoot: Option[ConfigNodePropertyString],
                servletresolverPeriodcacheSize: Option[ConfigNodePropertyInteger],
                servletresolverPeriodpaths: Option[ConfigNodePropertyArray],
                servletresolverPerioddefaultExtensions: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingServletsResolverSlingServletResolverProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServletsResolverSlingServletResolverProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsResolverSlingServletResolverProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsResolverSlingServletResolverProperties] = deriveEncoder
}
