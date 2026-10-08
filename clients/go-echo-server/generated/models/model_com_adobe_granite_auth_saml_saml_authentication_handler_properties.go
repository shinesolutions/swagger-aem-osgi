package models

type ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties struct {

	Path ConfigNodePropertyArray `json:"path,omitempty"`

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`

	IdpUrl ConfigNodePropertyString `json:"idpUrl,omitempty"`

	IdpCertAlias ConfigNodePropertyString `json:"idpCertAlias,omitempty"`

	IdpHttpRedirect ConfigNodePropertyBoolean `json:"idpHttpRedirect,omitempty"`

	ServiceProviderEntityId ConfigNodePropertyString `json:"serviceProviderEntityId,omitempty"`

	AssertionConsumerServiceURL ConfigNodePropertyString `json:"assertionConsumerServiceURL,omitempty"`

	SpPrivateKeyAlias ConfigNodePropertyString `json:"spPrivateKeyAlias,omitempty"`

	KeyStorePassword ConfigNodePropertyString `json:"keyStorePassword,omitempty"`

	DefaultRedirectUrl ConfigNodePropertyString `json:"defaultRedirectUrl,omitempty"`

	UserIDAttribute ConfigNodePropertyString `json:"userIDAttribute,omitempty"`

	UseEncryption ConfigNodePropertyBoolean `json:"useEncryption,omitempty"`

	CreateUser ConfigNodePropertyBoolean `json:"createUser,omitempty"`

	UserIntermediatePath ConfigNodePropertyString `json:"userIntermediatePath,omitempty"`

	AddGroupMemberships ConfigNodePropertyBoolean `json:"addGroupMemberships,omitempty"`

	GroupMembershipAttribute ConfigNodePropertyString `json:"groupMembershipAttribute,omitempty"`

	DefaultGroups ConfigNodePropertyArray `json:"defaultGroups,omitempty"`

	NameIdFormat ConfigNodePropertyString `json:"nameIdFormat,omitempty"`

	SynchronizeAttributes ConfigNodePropertyArray `json:"synchronizeAttributes,omitempty"`

	HandleLogout ConfigNodePropertyBoolean `json:"handleLogout,omitempty"`

	LogoutUrl ConfigNodePropertyString `json:"logoutUrl,omitempty"`

	ClockTolerance ConfigNodePropertyInteger `json:"clockTolerance,omitempty"`

	DigestMethod ConfigNodePropertyString `json:"digestMethod,omitempty"`

	SignatureMethod ConfigNodePropertyString `json:"signatureMethod,omitempty"`

	IdentitySyncType ConfigNodePropertyDropDown `json:"identitySyncType,omitempty"`

	IdpIdentifier ConfigNodePropertyString `json:"idpIdentifier,omitempty"`
}
