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

type OrgApacheSlingEngineParametersProperties struct {

	SlingDefaultParameterEncoding *ConfigNodePropertyString `json:"sling.default.parameter.encoding,omitempty"`

	SlingDefaultMaxParameters *ConfigNodePropertyInteger `json:"sling.default.max.parameters,omitempty"`

	FileLocation *ConfigNodePropertyString `json:"file.location,omitempty"`

	FileThreshold *ConfigNodePropertyInteger `json:"file.threshold,omitempty"`

	FileMax *ConfigNodePropertyInteger `json:"file.max,omitempty"`

	RequestMax *ConfigNodePropertyInteger `json:"request.max,omitempty"`

	SlingDefaultParameterCheckForAdditionalContainerParameters *ConfigNodePropertyBoolean `json:"sling.default.parameter.checkForAdditionalContainerParameters,omitempty"`
}