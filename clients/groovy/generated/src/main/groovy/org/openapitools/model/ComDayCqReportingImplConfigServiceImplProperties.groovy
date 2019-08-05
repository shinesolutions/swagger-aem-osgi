package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqReportingImplConfigServiceImplProperties {
    ConfigNodePropertyString repconfTimezone = null

    ConfigNodePropertyString repconfLocale = null

    ConfigNodePropertyString repconfSnapshots = null

    ConfigNodePropertyString repconfRepdir = null

    ConfigNodePropertyInteger repconfHourofday = null

    ConfigNodePropertyInteger repconfMinofhour = null

    ConfigNodePropertyInteger repconfMaxrows = null

    ConfigNodePropertyBoolean repconfFakedata = null

    ConfigNodePropertyString repconfSnapshotuser = null

    ConfigNodePropertyBoolean repconfEnforcesnapshotuser = null

}
