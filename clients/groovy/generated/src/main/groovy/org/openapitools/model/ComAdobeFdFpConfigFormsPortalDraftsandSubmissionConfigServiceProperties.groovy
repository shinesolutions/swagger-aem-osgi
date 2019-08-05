package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    ConfigNodePropertyArray portalOutboxes = null

    ConfigNodePropertyString draftDataService = null

    ConfigNodePropertyString draftMetadataService = null

    ConfigNodePropertyString submitDataService = null

    ConfigNodePropertyString submitMetadataService = null

    ConfigNodePropertyString pendingSignDataService = null

    ConfigNodePropertyString pendingSignMetadataService = null

}
