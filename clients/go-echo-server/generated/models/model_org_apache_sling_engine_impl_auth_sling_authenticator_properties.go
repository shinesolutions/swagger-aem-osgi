package models

type OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties struct {

	OsgiHttpWhiteboardContextSelect ConfigNodePropertyString `json:"osgi.http.whiteboard.context.select,omitempty"`

	OsgiHttpWhiteboardListener ConfigNodePropertyString `json:"osgi.http.whiteboard.listener,omitempty"`

	AuthSudoCookie ConfigNodePropertyString `json:"auth.sudo.cookie,omitempty"`

	AuthSudoParameter ConfigNodePropertyString `json:"auth.sudo.parameter,omitempty"`

	AuthAnnonymous ConfigNodePropertyBoolean `json:"auth.annonymous,omitempty"`

	SlingAuthRequirements ConfigNodePropertyArray `json:"sling.auth.requirements,omitempty"`

	SlingAuthAnonymousUser ConfigNodePropertyString `json:"sling.auth.anonymous.user,omitempty"`

	SlingAuthAnonymousPassword ConfigNodePropertyString `json:"sling.auth.anonymous.password,omitempty"`

	AuthHttp ConfigNodePropertyDropDown `json:"auth.http,omitempty"`

	AuthHttpRealm ConfigNodePropertyString `json:"auth.http.realm,omitempty"`

	AuthUriSuffix ConfigNodePropertyArray `json:"auth.uri.suffix,omitempty"`
}
