package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheSlingTracerInternalLogTracerProperties {
    ConfigNodePropertyArray tracerSets = null

    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyBoolean servletEnabled = null

    ConfigNodePropertyInteger recordingCacheSizeInMB = null

    ConfigNodePropertyInteger recordingCacheDurationInSecs = null

    ConfigNodePropertyBoolean recordingCompressionEnabled = null

    ConfigNodePropertyBoolean gzipResponse = null

}
