package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyString
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
 * @param orgApacheSlingCommonsLogLevel 
 * @param orgApacheSlingCommonsLogFile 
 * @param orgApacheSlingCommonsLogPattern 
 * @param orgApacheSlingCommonsLogNames 
 * @param orgApacheSlingCommonsLogAdditiv 
 */
data class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.level")
    @get:JsonProperty("org.apache.sling.commons.log.level") val orgApacheSlingCommonsLogLevel: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.file")
    @get:JsonProperty("org.apache.sling.commons.log.file") val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.pattern")
    @get:JsonProperty("org.apache.sling.commons.log.pattern") val orgApacheSlingCommonsLogPattern: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.names")
    @get:JsonProperty("org.apache.sling.commons.log.names") val orgApacheSlingCommonsLogNames: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.additiv")
    @get:JsonProperty("org.apache.sling.commons.log.additiv") val orgApacheSlingCommonsLogAdditiv: ConfigNodePropertyBoolean? = null
) {

}

