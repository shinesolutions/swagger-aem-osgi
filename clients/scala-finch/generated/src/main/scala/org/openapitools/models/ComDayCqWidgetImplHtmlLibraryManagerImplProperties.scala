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
 * @param htmllibmanagerPeriodclientmanager 
 * @param htmllibmanagerPerioddebug 
 * @param htmllibmanagerPerioddebugPeriodconsole 
 * @param htmllibmanagerPerioddebugPeriodinitPeriodjs 
 * @param htmllibmanagerPerioddefaultthemename 
 * @param htmllibmanagerPerioddefaultuserthemename 
 * @param htmllibmanagerPeriodfirebuglitePeriodpath 
 * @param htmllibmanagerPeriodforceCQUrlInfo 
 * @param htmllibmanagerPeriodgzip 
 * @param htmllibmanagerPeriodmaxage 
 * @param htmllibmanagerPeriodmaxDataUriSize 
 * @param htmllibmanagerPeriodminify 
 * @param htmllibmanagerPeriodpathPeriodlist 
 * @param htmllibmanagerPeriodtiming 
 */
case class ComDayCqWidgetImplHtmlLibraryManagerImplProperties(htmllibmanagerPeriodclientmanager: Option[ConfigNodePropertyString],
                htmllibmanagerPerioddebug: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPerioddebugPeriodconsole: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPerioddebugPeriodinitPeriodjs: Option[ConfigNodePropertyString],
                htmllibmanagerPerioddefaultthemename: Option[ConfigNodePropertyString],
                htmllibmanagerPerioddefaultuserthemename: Option[ConfigNodePropertyString],
                htmllibmanagerPeriodfirebuglitePeriodpath: Option[ConfigNodePropertyString],
                htmllibmanagerPeriodforceCQUrlInfo: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodgzip: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodmaxage: Option[ConfigNodePropertyInteger],
                htmllibmanagerPeriodmaxDataUriSize: Option[ConfigNodePropertyInteger],
                htmllibmanagerPeriodminify: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodpathPeriodlist: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodtiming: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWidgetImplHtmlLibraryManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWidgetImplHtmlLibraryManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWidgetImplHtmlLibraryManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWidgetImplHtmlLibraryManagerImplProperties] = deriveEncoder
}
