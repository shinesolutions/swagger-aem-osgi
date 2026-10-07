package models

type ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties struct {

	Path ConfigNodePropertyString `json:"path,omitempty"`

	JaasControlFlag ConfigNodePropertyString `json:"jaas.controlFlag,omitempty"`

	JaasRealmName ConfigNodePropertyString `json:"jaas.realmName,omitempty"`

	JaasRanking ConfigNodePropertyInteger `json:"jaas.ranking,omitempty"`

	OauthOfflineValidation ConfigNodePropertyBoolean `json:"oauth.offline.validation,omitempty"`
}
