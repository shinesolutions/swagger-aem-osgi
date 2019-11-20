/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties (
  orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean] = None,
  mode: Option[ConfigNodePropertyDropDown] = None,
  port: Option[ConfigNodePropertyInteger] = None,
  primaryHost: Option[ConfigNodePropertyString] = None,
  interval: Option[ConfigNodePropertyInteger] = None,
  primaryAllowedClientIpRanges: Option[ConfigNodePropertyArray] = None,
  secure: Option[ConfigNodePropertyBoolean] = None,
  standbyReadtimeout: Option[ConfigNodePropertyInteger] = None,
  standbyAutoclean: Option[ConfigNodePropertyBoolean] = None
)
