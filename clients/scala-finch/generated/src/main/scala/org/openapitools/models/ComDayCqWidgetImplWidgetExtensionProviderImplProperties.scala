package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param extendablePeriodwidgets 
 * @param widgetextensionproviderPerioddebug 
 */
case class ComDayCqWidgetImplWidgetExtensionProviderImplProperties(extendablePeriodwidgets: Option[ConfigNodePropertyArray],
                widgetextensionproviderPerioddebug: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
    /**
     * Creates the codec for converting ComDayCqWidgetImplWidgetExtensionProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWidgetImplWidgetExtensionProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWidgetImplWidgetExtensionProviderImplProperties] = deriveEncoder
}
