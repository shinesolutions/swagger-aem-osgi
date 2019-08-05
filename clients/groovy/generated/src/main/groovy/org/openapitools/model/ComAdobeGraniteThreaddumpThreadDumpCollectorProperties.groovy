package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
    ConfigNodePropertyInteger schedulerPeriod = null

    ConfigNodePropertyDropDown schedulerRunOn = null

    ConfigNodePropertyBoolean graniteThreaddumpEnabled = null

    ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile = null

    ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression = null

    ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression = null

    ConfigNodePropertyBoolean graniteThreaddumpEnableJStack = null

    ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays = null

    ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger = null

}
