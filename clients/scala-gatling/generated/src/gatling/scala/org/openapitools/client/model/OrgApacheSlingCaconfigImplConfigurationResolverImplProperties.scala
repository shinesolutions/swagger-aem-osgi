
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties (
    _configBucketNames: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {
    def toStringBody(var_configBucketNames: Object) =
        s"""
        | {
        | "configBucketNames":$var_configBucketNames
        | }
        """.stripMargin
}
