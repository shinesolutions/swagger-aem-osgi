
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterDesignPackageImporterProperties (
    _extractFilter: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmDesignimporterDesignPackageImporterProperties {
    def toStringBody(var_extractFilter: Object) =
        s"""
        | {
        | "extractFilter":$var_extractFilter
        | }
        """.stripMargin
}
