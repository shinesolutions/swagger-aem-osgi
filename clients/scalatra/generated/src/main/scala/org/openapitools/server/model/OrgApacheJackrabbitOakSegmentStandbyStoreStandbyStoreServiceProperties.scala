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

case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
  orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist: Option[ConfigNodePropertyBoolean],

  mode: Option[ConfigNodePropertyDropDown],

  port: Option[ConfigNodePropertyInteger],

  primaryPeriodhost: Option[ConfigNodePropertyString],

  interval: Option[ConfigNodePropertyInteger],

  primaryPeriodallowedMinusclientMinusipMinusranges: Option[ConfigNodePropertyArray],

  secure: Option[ConfigNodePropertyBoolean],

  standbyPeriodreadtimeout: Option[ConfigNodePropertyInteger],

  standbyPeriodautoclean: Option[ConfigNodePropertyBoolean]

 )