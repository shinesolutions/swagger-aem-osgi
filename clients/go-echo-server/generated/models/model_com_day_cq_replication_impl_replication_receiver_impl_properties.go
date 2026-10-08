package models

type ComDayCqReplicationImplReplicationReceiverImplProperties struct {

	ReceiverTmpfileThreshold ConfigNodePropertyInteger `json:"receiver.tmpfile.threshold,omitempty"`

	ReceiverPackagesUseInstall ConfigNodePropertyBoolean `json:"receiver.packages.use.install,omitempty"`
}
