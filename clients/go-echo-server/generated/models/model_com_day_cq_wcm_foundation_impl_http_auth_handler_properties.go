package models

type ComDayCqWcmFoundationImplHttpAuthHandlerProperties struct {

	Path ConfigNodePropertyString `json:"path,omitempty"`

	AuthHttpNologin ConfigNodePropertyBoolean `json:"auth.http.nologin,omitempty"`

	AuthHttpRealm ConfigNodePropertyString `json:"auth.http.realm,omitempty"`

	AuthDefaultLoginpage ConfigNodePropertyString `json:"auth.default.loginpage,omitempty"`

	AuthCredForm ConfigNodePropertyArray `json:"auth.cred.form,omitempty"`

	AuthCredUtf8 ConfigNodePropertyArray `json:"auth.cred.utf8,omitempty"`
}
