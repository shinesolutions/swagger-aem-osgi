package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyFloat
import org.openapitools.model.ConfigNodePropertyInteger
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param orgApacheFelixEventadminThreadPoolSize 
 * @param orgApacheFelixEventadminAsyncToSyncThreadRatio 
 * @param orgApacheFelixEventadminTimeout 
 * @param orgApacheFelixEventadminRequireTopic 
 * @param orgApacheFelixEventadminIgnoreTimeout 
 * @param orgApacheFelixEventadminIgnoreTopic 
 */
data class OrgApacheFelixEventadminImplEventAdminProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
    @get:JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize") val orgApacheFelixEventadminThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
    @get:JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio") val orgApacheFelixEventadminAsyncToSyncThreadRatio: ConfigNodePropertyFloat? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.Timeout")
    @get:JsonProperty("org.apache.felix.eventadmin.Timeout") val orgApacheFelixEventadminTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.RequireTopic")
    @get:JsonProperty("org.apache.felix.eventadmin.RequireTopic") val orgApacheFelixEventadminRequireTopic: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
    @get:JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout") val orgApacheFelixEventadminIgnoreTimeout: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
    @get:JsonProperty("org.apache.felix.eventadmin.IgnoreTopic") val orgApacheFelixEventadminIgnoreTopic: ConfigNodePropertyArray? = null
) {

}

