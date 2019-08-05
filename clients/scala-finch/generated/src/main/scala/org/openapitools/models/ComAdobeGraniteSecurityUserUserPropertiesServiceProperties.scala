package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param adapterPeriodcondition 
 * @param granitePerioduserpropertiesPeriodnodetypes 
 * @param granitePerioduserpropertiesPeriodresourcetypes 
 */
case class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(adapterPeriodcondition: Option[ConfigNodePropertyString],
                granitePerioduserpropertiesPeriodnodetypes: Option[ConfigNodePropertyArray],
                granitePerioduserpropertiesPeriodresourcetypes: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteSecurityUserUserPropertiesServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties] = deriveEncoder
}
