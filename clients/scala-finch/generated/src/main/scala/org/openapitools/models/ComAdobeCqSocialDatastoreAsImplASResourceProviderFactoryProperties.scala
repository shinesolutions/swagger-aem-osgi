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
 * @param versionPeriodid 
 * @param cachePeriodon 
 * @param concurrencyPeriodlevel 
 * @param cachePeriodstartPeriodsize 
 * @param cachePeriodttl 
 * @param cachePeriodsize 
 * @param timePeriodlimit 
 */
case class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(versionPeriodid: Option[ConfigNodePropertyString],
                cachePeriodon: Option[ConfigNodePropertyBoolean],
                concurrencyPeriodlevel: Option[ConfigNodePropertyInteger],
                cachePeriodstartPeriodsize: Option[ConfigNodePropertyInteger],
                cachePeriodttl: Option[ConfigNodePropertyInteger],
                cachePeriodsize: Option[ConfigNodePropertyInteger],
                timePeriodlimit: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties] = deriveEncoder
}
