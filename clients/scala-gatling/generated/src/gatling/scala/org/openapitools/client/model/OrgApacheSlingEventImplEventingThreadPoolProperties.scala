
package org.openapitools.client.model


case class OrgApacheSlingEventImplEventingThreadPoolProperties (
    _minPoolSize: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingEventImplEventingThreadPoolProperties {
    def toStringBody(var_minPoolSize: Object) =
        s"""
        | {
        | "minPoolSize":$var_minPoolSize
        | }
        """.stripMargin
}
