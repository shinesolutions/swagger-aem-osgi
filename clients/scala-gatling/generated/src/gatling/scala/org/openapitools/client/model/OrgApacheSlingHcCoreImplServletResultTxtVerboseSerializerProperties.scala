
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties (
    _totalWidth: Option[ConfigNodePropertyInteger],
    _colWidthName: Option[ConfigNodePropertyInteger],
    _colWidthResult: Option[ConfigNodePropertyInteger],
    _colWidthTiming: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
    def toStringBody(var_totalWidth: Object, var_colWidthName: Object, var_colWidthResult: Object, var_colWidthTiming: Object) =
        s"""
        | {
        | "totalWidth":$var_totalWidth,"colWidthName":$var_colWidthName,"colWidthResult":$var_colWidthResult,"colWidthTiming":$var_colWidthTiming
        | }
        """.stripMargin
}
