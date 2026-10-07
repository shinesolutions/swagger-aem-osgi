package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(
    val formsFormparagraphpostprocessorEnabled: ConfigNodePropertyBoolean? = null,
    val formsFormparagraphpostprocessorFormresourcetypes: ConfigNodePropertyArray? = null
)
