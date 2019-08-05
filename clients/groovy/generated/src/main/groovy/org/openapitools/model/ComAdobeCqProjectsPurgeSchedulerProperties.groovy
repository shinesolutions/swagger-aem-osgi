package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqProjectsPurgeSchedulerProperties {
    ConfigNodePropertyString scheduledpurgeName = null

    ConfigNodePropertyBoolean scheduledpurgePurgeActive = null

    ConfigNodePropertyArray scheduledpurgeTemplates = null

    ConfigNodePropertyBoolean scheduledpurgePurgeGroups = null

    ConfigNodePropertyBoolean scheduledpurgePurgeAssets = null

    ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows = null

    ConfigNodePropertyInteger scheduledpurgeDaysold = null

    ConfigNodePropertyInteger scheduledpurgeSaveThreshold = null

}
