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
case class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[ConfigNodePropertyString]
                )

object OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties] = deriveEncoder
}
