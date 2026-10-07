package models

type ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties struct {

	OffloadingTransporter ConfigNodePropertyString `json:"offloading.transporter,omitempty"`

	OffloadingCleanupPayload ConfigNodePropertyBoolean `json:"offloading.cleanup.payload,omitempty"`
}
