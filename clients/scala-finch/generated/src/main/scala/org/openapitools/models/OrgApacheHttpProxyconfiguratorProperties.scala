package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param proxyPeriodenabled 
 * @param proxyPeriodhost 
 * @param proxyPeriodport 
 * @param proxyPerioduser 
 * @param proxyPeriodpassword 
 * @param proxyPeriodexceptions 
 */
case class OrgApacheHttpProxyconfiguratorProperties(proxyPeriodenabled: Option[ConfigNodePropertyBoolean],
                proxyPeriodhost: Option[ConfigNodePropertyString],
                proxyPeriodport: Option[ConfigNodePropertyInteger],
                proxyPerioduser: Option[ConfigNodePropertyString],
                proxyPeriodpassword: Option[ConfigNodePropertyString],
                proxyPeriodexceptions: Option[ConfigNodePropertyArray]
                )

object OrgApacheHttpProxyconfiguratorProperties {
    /**
     * Creates the codec for converting OrgApacheHttpProxyconfiguratorProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheHttpProxyconfiguratorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheHttpProxyconfiguratorProperties] = deriveEncoder
}
