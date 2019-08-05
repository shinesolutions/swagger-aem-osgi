package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cachePeriodenable 
 * @param cachePeriodrootPaths 
 * @param cachePeriodmaxSize 
 * @param cachePeriodmaxEntries 
 */
case class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(cachePeriodenable: Option[ConfigNodePropertyBoolean],
                cachePeriodrootPaths: Option[ConfigNodePropertyArray],
                cachePeriodmaxSize: Option[ConfigNodePropertyInteger],
                cachePeriodmaxEntries: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties] = deriveEncoder
}
