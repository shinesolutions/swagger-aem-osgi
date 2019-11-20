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

type ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties struct {
	OauthIssuer ConfigNodePropertyString `json:"oauth.issuer,omitempty"`
	OauthAccessTokenExpiresIn ConfigNodePropertyString `json:"oauth.access.token.expires.in,omitempty"`
	OsgiHttpWhiteboardServletPattern ConfigNodePropertyString `json:"osgi.http.whiteboard.servlet.pattern,omitempty"`
	OsgiHttpWhiteboardContextSelect ConfigNodePropertyString `json:"osgi.http.whiteboard.context.select,omitempty"`
}