package models

type ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties struct {

	EventFilter ConfigNodePropertyString `json:"event.filter,omitempty"`

	LaunchesEventhandlerThreadpoolMaxsize ConfigNodePropertyInteger `json:"launches.eventhandler.threadpool.maxsize,omitempty"`

	LaunchesEventhandlerThreadpoolPriority ConfigNodePropertyDropDown `json:"launches.eventhandler.threadpool.priority,omitempty"`

	LaunchesEventhandlerUpdatelastmodification ConfigNodePropertyBoolean `json:"launches.eventhandler.updatelastmodification,omitempty"`
}
