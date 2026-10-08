package models

type ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties struct {

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	DispatcherAddress ConfigNodePropertyString `json:"dispatcher.address,omitempty"`

	DispatcherFilterAllowed ConfigNodePropertyArray `json:"dispatcher.filter.allowed,omitempty"`

	DispatcherFilterBlocked ConfigNodePropertyArray `json:"dispatcher.filter.blocked,omitempty"`
}
