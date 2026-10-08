package models

type ComDayCqDamCoreImplDamEventRecorderImplProperties struct {

	EventFilter ConfigNodePropertyString `json:"event.filter,omitempty"`

	EventQueueLength ConfigNodePropertyInteger `json:"event.queue.length,omitempty"`

	EventrecorderEnabled ConfigNodePropertyBoolean `json:"eventrecorder.enabled,omitempty"`

	EventrecorderBlacklist ConfigNodePropertyArray `json:"eventrecorder.blacklist,omitempty"`

	EventrecorderEventtypes ConfigNodePropertyDropDown `json:"eventrecorder.eventtypes,omitempty"`
}
