package models

type OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties struct {

	TimeoutInMs ConfigNodePropertyInteger `json:"timeoutInMs,omitempty"`

	LongRunningFutureThresholdForCriticalMs ConfigNodePropertyInteger `json:"longRunningFutureThresholdForCriticalMs,omitempty"`

	ResultCacheTtlInMs ConfigNodePropertyInteger `json:"resultCacheTtlInMs,omitempty"`
}
