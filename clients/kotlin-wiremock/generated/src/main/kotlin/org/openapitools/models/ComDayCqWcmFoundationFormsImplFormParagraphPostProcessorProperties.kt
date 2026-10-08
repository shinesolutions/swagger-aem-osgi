@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(
    @field:JsonProperty("forms.formparagraphpostprocessor.enabled")
    val formsFormparagraphpostprocessorEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
    val formsFormparagraphpostprocessorFormresourcetypes: ConfigNodePropertyArray? = null,

)
