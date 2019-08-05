package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param queryPeriodlimit 
 * @param filePeriodtypePeriodextensionPeriodmap 
 */
case class ComAdobeGraniteAcpPlatformPlatformServletProperties(queryPeriodlimit: Option[ConfigNodePropertyInteger],
                filePeriodtypePeriodextensionPeriodmap: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteAcpPlatformPlatformServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAcpPlatformPlatformServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAcpPlatformPlatformServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAcpPlatformPlatformServletProperties] = deriveEncoder
}
