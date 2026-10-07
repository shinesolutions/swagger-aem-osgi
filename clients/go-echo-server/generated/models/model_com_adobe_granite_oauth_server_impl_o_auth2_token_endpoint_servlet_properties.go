package models

type ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties struct {

	OauthIssuer ConfigNodePropertyString `json:"oauth.issuer,omitempty"`

	OauthAccessTokenExpiresIn ConfigNodePropertyString `json:"oauth.access.token.expires.in,omitempty"`

	OsgiHttpWhiteboardServletPattern ConfigNodePropertyString `json:"osgi.http.whiteboard.servlet.pattern,omitempty"`

	OsgiHttpWhiteboardContextSelect ConfigNodePropertyString `json:"osgi.http.whiteboard.context.select,omitempty"`
}
