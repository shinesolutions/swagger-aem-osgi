/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
  preservePeriodhierarchyPeriodnodes: Option[ConfigNodePropertyBoolean],

  ignorePeriodversioning: Option[ConfigNodePropertyBoolean],

  importPeriodacl: Option[ConfigNodePropertyBoolean],

  savePeriodthreshold: Option[ConfigNodePropertyInteger],

  preservePerioduserPeriodpaths: Option[ConfigNodePropertyBoolean],

  preservePerioduuid: Option[ConfigNodePropertyBoolean],

  preservePerioduuidPeriodnodetypes: Option[ConfigNodePropertyArray],

  preservePerioduuidPeriodsubtrees: Option[ConfigNodePropertyArray],

  autoPeriodcommit: Option[ConfigNodePropertyBoolean]

 )