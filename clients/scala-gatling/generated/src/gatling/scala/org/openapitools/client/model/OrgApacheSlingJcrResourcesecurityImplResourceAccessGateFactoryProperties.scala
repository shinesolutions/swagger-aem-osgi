
package org.openapitools.client.model


case class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties (
    _path: Option[ConfigNodePropertyString],
    _checkpathPrefix: Option[ConfigNodePropertyString],
    _jcrPath: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
    def toStringBody(var_path: Object, var_checkpathPrefix: Object, var_jcrPath: Object) =
        s"""
        | {
        | "path":$var_path,"checkpathPrefix":$var_checkpathPrefix,"jcrPath":$var_jcrPath
        | }
        """.stripMargin
}
