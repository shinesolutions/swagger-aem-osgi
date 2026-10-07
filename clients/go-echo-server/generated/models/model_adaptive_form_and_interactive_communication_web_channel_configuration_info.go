package models

type AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties `json:"properties,omitempty"`
}
