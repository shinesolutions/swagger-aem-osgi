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
 * @param slingPeriodservletPeriodresourceTypes 
 * @param slingPeriodservletPeriodselectors 
 * @param resourcePeriodwhitelist 
 * @param resourcePeriodblacklist 
 */
case class ComDayCqWcmFoundationFormsImplMailServletProperties(slingPeriodservletPeriodresourceTypes: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString],
                resourcePeriodwhitelist: Option[ConfigNodePropertyArray],
                resourcePeriodblacklist: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmFoundationFormsImplMailServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplMailServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplMailServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplMailServletProperties] = deriveEncoder
}
