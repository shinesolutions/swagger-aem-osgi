/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * API version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type OrgApacheSlingCommonsMetricsInternalLogReporterProperties struct {
	Period ConfigNodePropertyInteger `json:"period,omitempty"`
	TimeUnit ConfigNodePropertyDropDown `json:"timeUnit,omitempty"`
	Level ConfigNodePropertyDropDown `json:"level,omitempty"`
	LoggerName ConfigNodePropertyString `json:"loggerName,omitempty"`
	Prefix ConfigNodePropertyString `json:"prefix,omitempty"`
	Pattern ConfigNodePropertyString `json:"pattern,omitempty"`
	RegistryName ConfigNodePropertyString `json:"registryName,omitempty"`
}