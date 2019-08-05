package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodhost 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodenable 
 * @param orgPeriodosgiPeriodservicePeriodhttpPeriodport 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodenable 
 * @param orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded 
 * @param orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly 
 * @param orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath 
 * @param orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodname 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes 
 * @param orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid 
 */
case class OrgApacheFelixHttpProperties(orgPeriodapachePeriodfelixPeriodhttpPeriodhost: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpPeriodenable: Option[ConfigNodePropertyBoolean],
                orgPeriodosgiPeriodservicePeriodhttpPeriodport: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[ConfigNodePropertyBoolean],
                orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[ConfigNodePropertyDropDown],
                orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure: Option[ConfigNodePropertyBoolean],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName: Option[ConfigNodePropertyString],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding: Option[ConfigNodePropertyBoolean],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie: Option[ConfigNodePropertyString],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain: Option[ConfigNodePropertyString],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath: Option[ConfigNodePropertyString],
                orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodhttpPeriodname: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheFelixHttpProperties {
    /**
     * Creates the codec for converting OrgApacheFelixHttpProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixHttpProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixHttpProperties] = deriveEncoder
}
