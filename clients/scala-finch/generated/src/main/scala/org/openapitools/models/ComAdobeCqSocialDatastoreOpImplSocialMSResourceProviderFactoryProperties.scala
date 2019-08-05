package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param solrPeriodzkPeriodtimeout 
 * @param solrPeriodcommit 
 * @param cachePeriodon 
 * @param concurrencyPeriodlevel 
 * @param cachePeriodstartPeriodsize 
 * @param cachePeriodttl 
 * @param cachePeriodsize 
 */
case class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(solrPeriodzkPeriodtimeout: Option[ConfigNodePropertyString],
                solrPeriodcommit: Option[ConfigNodePropertyString],
                cachePeriodon: Option[ConfigNodePropertyBoolean],
                concurrencyPeriodlevel: Option[ConfigNodePropertyInteger],
                cachePeriodstartPeriodsize: Option[ConfigNodePropertyInteger],
                cachePeriodttl: Option[ConfigNodePropertyInteger],
                cachePeriodsize: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = deriveEncoder
}
