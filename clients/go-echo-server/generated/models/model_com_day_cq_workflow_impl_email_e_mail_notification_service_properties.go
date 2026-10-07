package models

type ComDayCqWorkflowImplEmailEMailNotificationServiceProperties struct {

	FromAddress ConfigNodePropertyString `json:"from.address,omitempty"`

	HostPrefix ConfigNodePropertyString `json:"host.prefix,omitempty"`

	NotifyOnabort ConfigNodePropertyBoolean `json:"notify.onabort,omitempty"`

	NotifyOncomplete ConfigNodePropertyBoolean `json:"notify.oncomplete,omitempty"`

	NotifyOncontainercomplete ConfigNodePropertyBoolean `json:"notify.oncontainercomplete,omitempty"`

	NotifyUseronly ConfigNodePropertyBoolean `json:"notify.useronly,omitempty"`
}
