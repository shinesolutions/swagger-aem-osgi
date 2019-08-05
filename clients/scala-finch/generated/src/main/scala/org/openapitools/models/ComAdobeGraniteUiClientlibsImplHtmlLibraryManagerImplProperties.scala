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
 * @param htmllibmanagerPeriodtiming 
 * @param htmllibmanagerPerioddebugPeriodinitPeriodjs 
 * @param htmllibmanagerPeriodminify 
 * @param htmllibmanagerPerioddebug 
 * @param htmllibmanagerPeriodgzip 
 * @param htmllibmanagerPeriodmaxDataUriSize 
 * @param htmllibmanagerPeriodmaxage 
 * @param htmllibmanagerPeriodforceCQUrlInfo 
 * @param htmllibmanagerPerioddefaultthemename 
 * @param htmllibmanagerPerioddefaultuserthemename 
 * @param htmllibmanagerPeriodclientmanager 
 * @param htmllibmanagerPeriodpathPeriodlist 
 * @param htmllibmanagerPeriodexcludedPeriodpathPeriodlist 
 * @param htmllibmanagerPeriodprocessorPeriodjs 
 * @param htmllibmanagerPeriodprocessorPeriodcss 
 * @param htmllibmanagerPeriodlongcachePeriodpatterns 
 * @param htmllibmanagerPeriodlongcachePeriodformat 
 * @param htmllibmanagerPerioduseFileSystemOutputCache 
 * @param htmllibmanagerPeriodfileSystemOutputCacheLocation 
 * @param htmllibmanagerPerioddisablePeriodreplacement 
 */
case class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(htmllibmanagerPeriodtiming: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPerioddebugPeriodinitPeriodjs: Option[ConfigNodePropertyString],
                htmllibmanagerPeriodminify: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPerioddebug: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodgzip: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodmaxDataUriSize: Option[ConfigNodePropertyInteger],
                htmllibmanagerPeriodmaxage: Option[ConfigNodePropertyInteger],
                htmllibmanagerPeriodforceCQUrlInfo: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPerioddefaultthemename: Option[ConfigNodePropertyString],
                htmllibmanagerPerioddefaultuserthemename: Option[ConfigNodePropertyString],
                htmllibmanagerPeriodclientmanager: Option[ConfigNodePropertyString],
                htmllibmanagerPeriodpathPeriodlist: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodexcludedPeriodpathPeriodlist: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodprocessorPeriodjs: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodprocessorPeriodcss: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodlongcachePeriodpatterns: Option[ConfigNodePropertyArray],
                htmllibmanagerPeriodlongcachePeriodformat: Option[ConfigNodePropertyString],
                htmllibmanagerPerioduseFileSystemOutputCache: Option[ConfigNodePropertyBoolean],
                htmllibmanagerPeriodfileSystemOutputCacheLocation: Option[ConfigNodePropertyString],
                htmllibmanagerPerioddisablePeriodreplacement: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties] = deriveEncoder
}
