package models

type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties struct {

	HandlerName ConfigNodePropertyString `json:"handler.name,omitempty"`

	UserExpirationTime ConfigNodePropertyString `json:"user.expirationTime,omitempty"`

	UserAutoMembership ConfigNodePropertyArray `json:"user.autoMembership,omitempty"`

	UserPropertyMapping ConfigNodePropertyArray `json:"user.propertyMapping,omitempty"`

	UserPathPrefix ConfigNodePropertyString `json:"user.pathPrefix,omitempty"`

	UserMembershipExpTime ConfigNodePropertyString `json:"user.membershipExpTime,omitempty"`

	UserMembershipNestingDepth ConfigNodePropertyInteger `json:"user.membershipNestingDepth,omitempty"`

	UserDynamicMembership ConfigNodePropertyBoolean `json:"user.dynamicMembership,omitempty"`

	UserDisableMissing ConfigNodePropertyBoolean `json:"user.disableMissing,omitempty"`

	GroupExpirationTime ConfigNodePropertyString `json:"group.expirationTime,omitempty"`

	GroupAutoMembership ConfigNodePropertyArray `json:"group.autoMembership,omitempty"`

	GroupPropertyMapping ConfigNodePropertyArray `json:"group.propertyMapping,omitempty"`

	GroupPathPrefix ConfigNodePropertyString `json:"group.pathPrefix,omitempty"`

	EnableRFC7613UsercaseMappedProfile ConfigNodePropertyBoolean `json:"enableRFC7613UsercaseMappedProfile,omitempty"`
}
