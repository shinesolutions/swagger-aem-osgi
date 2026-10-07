
package org.openapitools.client.model


case class OrgApacheFelixEventadminImplEventAdminProperties (
    _orgApacheFelixEventadminThreadPoolSize: Option[ConfigNodePropertyInteger],
    _orgApacheFelixEventadminAsyncToSyncThreadRatio: Option[ConfigNodePropertyFloat],
    _orgApacheFelixEventadminTimeout: Option[ConfigNodePropertyInteger],
    _orgApacheFelixEventadminRequireTopic: Option[ConfigNodePropertyBoolean],
    _orgApacheFelixEventadminIgnoreTimeout: Option[ConfigNodePropertyArray],
    _orgApacheFelixEventadminIgnoreTopic: Option[ConfigNodePropertyArray]
)
object OrgApacheFelixEventadminImplEventAdminProperties {
    def toStringBody(var_orgApacheFelixEventadminThreadPoolSize: Object, var_orgApacheFelixEventadminAsyncToSyncThreadRatio: Object, var_orgApacheFelixEventadminTimeout: Object, var_orgApacheFelixEventadminRequireTopic: Object, var_orgApacheFelixEventadminIgnoreTimeout: Object, var_orgApacheFelixEventadminIgnoreTopic: Object) =
        s"""
        | {
        | "orgApacheFelixEventadminThreadPoolSize":$var_orgApacheFelixEventadminThreadPoolSize,"orgApacheFelixEventadminAsyncToSyncThreadRatio":$var_orgApacheFelixEventadminAsyncToSyncThreadRatio,"orgApacheFelixEventadminTimeout":$var_orgApacheFelixEventadminTimeout,"orgApacheFelixEventadminRequireTopic":$var_orgApacheFelixEventadminRequireTopic,"orgApacheFelixEventadminIgnoreTimeout":$var_orgApacheFelixEventadminIgnoreTimeout,"orgApacheFelixEventadminIgnoreTopic":$var_orgApacheFelixEventadminIgnoreTopic
        | }
        """.stripMargin
}
