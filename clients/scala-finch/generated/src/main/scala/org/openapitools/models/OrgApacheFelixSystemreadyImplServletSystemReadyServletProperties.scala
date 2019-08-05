package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect 
 */
case class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[ConfigNodePropertyString]
                )

object OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties] = deriveEncoder
}
