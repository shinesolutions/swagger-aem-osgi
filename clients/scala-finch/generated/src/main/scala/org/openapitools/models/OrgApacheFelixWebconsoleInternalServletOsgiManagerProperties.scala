package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param managerPeriodroot 
 * @param httpPeriodservicePeriodfilter 
 * @param defaultPeriodrender 
 * @param realm 
 * @param username 
 * @param password 
 * @param category 
 * @param locale 
 * @param loglevel 
 * @param plugins 
 */
case class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(managerPeriodroot: Option[ConfigNodePropertyString],
                httpPeriodservicePeriodfilter: Option[ConfigNodePropertyString],
                defaultPeriodrender: Option[ConfigNodePropertyString],
                realm: Option[ConfigNodePropertyString],
                username: Option[ConfigNodePropertyString],
                password: Option[ConfigNodePropertyString],
                category: Option[ConfigNodePropertyString],
                locale: Option[ConfigNodePropertyString],
                loglevel: Option[ConfigNodePropertyDropDown],
                plugins: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
    /**
     * Creates the codec for converting OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties] = deriveEncoder
}
