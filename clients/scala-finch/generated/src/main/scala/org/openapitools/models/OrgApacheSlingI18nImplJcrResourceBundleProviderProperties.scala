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
 * @param localePerioddefault 
 * @param preloadPeriodbundles 
 * @param invalidationPerioddelay 
 */
case class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(localePerioddefault: Option[ConfigNodePropertyString],
                preloadPeriodbundles: Option[ConfigNodePropertyBoolean],
                invalidationPerioddelay: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
    /**
     * Creates the codec for converting OrgApacheSlingI18nImplJcrResourceBundleProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties] = deriveEncoder
}
