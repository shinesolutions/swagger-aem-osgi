package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servletPath 
 * @param disabled 
 * @param corsPeriodaccessControlAllowOrigin 
 */
case class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(servletPath: Option[ConfigNodePropertyString],
                disabled: Option[ConfigNodePropertyBoolean],
                corsPeriodaccessControlAllowOrigin: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties] = deriveEncoder
}
