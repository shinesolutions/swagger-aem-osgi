package models

type OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties struct {

	UserMapping ConfigNodePropertyArray `json:"user.mapping,omitempty"`

	UserDefault ConfigNodePropertyString `json:"user.default,omitempty"`

	UserEnableDefaultMapping ConfigNodePropertyBoolean `json:"user.enable.default.mapping,omitempty"`

	RequireValidation ConfigNodePropertyBoolean `json:"require.validation,omitempty"`
}
