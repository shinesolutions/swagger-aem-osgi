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

type OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties struct {
	Timeout ConfigNodePropertyInteger `json:"timeout,omitempty"`
	TargetStartLevel ConfigNodePropertyInteger `json:"target.start.level,omitempty"`
	TargetStartLevelPropName ConfigNodePropertyString `json:"target.start.level.prop.name,omitempty"`
	Type ConfigNodePropertyDropDown `json:"type,omitempty"`
}