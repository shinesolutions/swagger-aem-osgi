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

type ComDayCommonsHttpclientProperties struct {

	ProxyEnabled *ConfigNodePropertyBoolean `json:"proxy.enabled,omitempty"`

	ProxyHost *ConfigNodePropertyString `json:"proxy.host,omitempty"`

	ProxyUser *ConfigNodePropertyString `json:"proxy.user,omitempty"`

	ProxyPassword *ConfigNodePropertyString `json:"proxy.password,omitempty"`

	ProxyNtlmHost *ConfigNodePropertyString `json:"proxy.ntlm.host,omitempty"`

	ProxyNtlmDomain *ConfigNodePropertyString `json:"proxy.ntlm.domain,omitempty"`

	ProxyExceptions *ConfigNodePropertyArray `json:"proxy.exceptions,omitempty"`
}