
package org.openapitools.client.model


case class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties (
    _name: Option[ConfigNodePropertyString],
    _minPoolSize: Option[ConfigNodePropertyInteger],
    _maxPoolSize: Option[ConfigNodePropertyInteger],
    _queueSize: Option[ConfigNodePropertyInteger],
    _maxThreadAge: Option[ConfigNodePropertyInteger],
    _keepAliveTime: Option[ConfigNodePropertyInteger],
    _blockPolicy: Option[ConfigNodePropertyDropDown],
    _shutdownGraceful: Option[ConfigNodePropertyBoolean],
    _daemon: Option[ConfigNodePropertyBoolean],
    _shutdownWaitTime: Option[ConfigNodePropertyInteger],
    _priority: Option[ConfigNodePropertyDropDown]
)
object OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    def toStringBody(var_name: Object, var_minPoolSize: Object, var_maxPoolSize: Object, var_queueSize: Object, var_maxThreadAge: Object, var_keepAliveTime: Object, var_blockPolicy: Object, var_shutdownGraceful: Object, var_daemon: Object, var_shutdownWaitTime: Object, var_priority: Object) =
        s"""
        | {
        | "name":$var_name,"minPoolSize":$var_minPoolSize,"maxPoolSize":$var_maxPoolSize,"queueSize":$var_queueSize,"maxThreadAge":$var_maxThreadAge,"keepAliveTime":$var_keepAliveTime,"blockPolicy":$var_blockPolicy,"shutdownGraceful":$var_shutdownGraceful,"daemon":$var_daemon,"shutdownWaitTime":$var_shutdownWaitTime,"priority":$var_priority
        | }
        """.stripMargin
}
