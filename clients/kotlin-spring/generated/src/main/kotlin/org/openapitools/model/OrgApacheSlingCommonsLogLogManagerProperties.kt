package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param orgApacheSlingCommonsLogFileNumber 
 * @param orgApacheSlingCommonsLogFileSize 
 * @param orgApacheSlingCommonsLogPattern 
 * @param orgApacheSlingCommonsLogConfigurationFile 
 * @param orgApacheSlingCommonsLogPackagingDataEnabled 
 * @param orgApacheSlingCommonsLogMaxCallerDataDepth 
 * @param orgApacheSlingCommonsLogMaxOldFileCountInDump 
 * @param orgApacheSlingCommonsLogNumOfLines 
 */
data class OrgApacheSlingCommonsLogLogManagerProperties(

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
    @param:JsonProperty("org.apache.sling.commons.log.file.number")
    @get:JsonProperty("org.apache.sling.commons.log.file.number") val orgApacheSlingCommonsLogFileNumber: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.file.size")
    @get:JsonProperty("org.apache.sling.commons.log.file.size") val orgApacheSlingCommonsLogFileSize: ConfigNodePropertyString? = null,

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
    @param:JsonProperty("org.apache.sling.commons.log.configurationFile")
    @get:JsonProperty("org.apache.sling.commons.log.configurationFile") val orgApacheSlingCommonsLogConfigurationFile: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
    @get:JsonProperty("org.apache.sling.commons.log.packagingDataEnabled") val orgApacheSlingCommonsLogPackagingDataEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
    @get:JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth") val orgApacheSlingCommonsLogMaxCallerDataDepth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
    @get:JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump") val orgApacheSlingCommonsLogMaxOldFileCountInDump: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.numOfLines")
    @get:JsonProperty("org.apache.sling.commons.log.numOfLines") val orgApacheSlingCommonsLogNumOfLines: ConfigNodePropertyInteger? = null
) {

}

