package models

type OrgApacheSlingTracerInternalLogTracerProperties struct {

	TracerSets ConfigNodePropertyArray `json:"tracerSets,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ServletEnabled ConfigNodePropertyBoolean `json:"servletEnabled,omitempty"`

	RecordingCacheSizeInMB ConfigNodePropertyInteger `json:"recordingCacheSizeInMB,omitempty"`

	RecordingCacheDurationInSecs ConfigNodePropertyInteger `json:"recordingCacheDurationInSecs,omitempty"`

	RecordingCompressionEnabled ConfigNodePropertyBoolean `json:"recordingCompressionEnabled,omitempty"`

	GzipResponse ConfigNodePropertyBoolean `json:"gzipResponse,omitempty"`
}
