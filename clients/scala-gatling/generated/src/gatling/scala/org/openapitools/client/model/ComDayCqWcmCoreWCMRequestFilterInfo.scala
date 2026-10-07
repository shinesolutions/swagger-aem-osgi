
package org.openapitools.client.model


case class ComDayCqWcmCoreWCMRequestFilterInfo (
    _pid: Option[String],
    _title: Option[String],
    _description: Option[String],
    _properties: Option[ComDayCqWcmCoreWCMRequestFilterProperties],
    _bundleLocation: Option[String],
    _serviceLocation: Option[String]
)
object ComDayCqWcmCoreWCMRequestFilterInfo {
    def toStringBody(var_pid: Object, var_title: Object, var_description: Object, var_properties: Object, var_bundleLocation: Object, var_serviceLocation: Object) =
        s"""
        | {
        | "pid":$var_pid,"title":$var_title,"description":$var_description,"properties":$var_properties,"bundleLocation":$var_bundleLocation,"serviceLocation":$var_serviceLocation
        | }
        """.stripMargin
}
