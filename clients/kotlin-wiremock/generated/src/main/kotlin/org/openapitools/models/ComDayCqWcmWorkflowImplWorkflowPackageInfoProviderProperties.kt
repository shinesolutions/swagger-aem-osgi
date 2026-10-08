@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(
    @field:JsonProperty("workflowpackageinfoprovider.filter")
    val workflowpackageinfoproviderFilter: ConfigNodePropertyArray? = null,

    @field:JsonProperty("workflowpackageinfoprovider.filter.rootpath")
    val workflowpackageinfoproviderFilterRootpath: ConfigNodePropertyString? = null,

)
