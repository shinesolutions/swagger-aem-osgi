
package org.openapitools.client.model


case class ComDayCqDamScene7ImplScene7APIClientImplProperties (
    _cqDamScene7ApiclientRecordsperpageNofilterName: Option[ConfigNodePropertyInteger],
    _cqDamScene7ApiclientRecordsperpageWithfilterName: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamScene7ImplScene7APIClientImplProperties {
    def toStringBody(var_cqDamScene7ApiclientRecordsperpageNofilterName: Object, var_cqDamScene7ApiclientRecordsperpageWithfilterName: Object) =
        s"""
        | {
        | "cqDamScene7ApiclientRecordsperpageNofilterName":$var_cqDamScene7ApiclientRecordsperpageNofilterName,"cqDamScene7ApiclientRecordsperpageWithfilterName":$var_cqDamScene7ApiclientRecordsperpageWithfilterName
        | }
        """.stripMargin
}
