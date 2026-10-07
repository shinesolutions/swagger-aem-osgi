
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties (
    _timeoutInMs: Option[ConfigNodePropertyInteger],
    _longRunningFutureThresholdForCriticalMs: Option[ConfigNodePropertyInteger],
    _resultCacheTtlInMs: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {
    def toStringBody(var_timeoutInMs: Object, var_longRunningFutureThresholdForCriticalMs: Object, var_resultCacheTtlInMs: Object) =
        s"""
        | {
        | "timeoutInMs":$var_timeoutInMs,"longRunningFutureThresholdForCriticalMs":$var_longRunningFutureThresholdForCriticalMs,"resultCacheTtlInMs":$var_resultCacheTtlInMs
        | }
        """.stripMargin
}
