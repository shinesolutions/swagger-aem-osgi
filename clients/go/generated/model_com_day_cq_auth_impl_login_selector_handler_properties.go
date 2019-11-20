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

type ComDayCqAuthImplLoginSelectorHandlerProperties struct {
	Path ConfigNodePropertyString `json:"path,omitempty"`
	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`
	AuthLoginselectorMappings ConfigNodePropertyArray `json:"auth.loginselector.mappings,omitempty"`
	AuthLoginselectorChangepwMappings ConfigNodePropertyArray `json:"auth.loginselector.changepw.mappings,omitempty"`
	AuthLoginselectorDefaultloginpage ConfigNodePropertyString `json:"auth.loginselector.defaultloginpage,omitempty"`
	AuthLoginselectorDefaultchangepwpage ConfigNodePropertyString `json:"auth.loginselector.defaultchangepwpage,omitempty"`
	AuthLoginselectorHandle ConfigNodePropertyArray `json:"auth.loginselector.handle,omitempty"`
	AuthLoginselectorHandleAllExtensions ConfigNodePropertyBoolean `json:"auth.loginselector.handle.all.extensions,omitempty"`
}