package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    
    ConfigNodePropertyArray portalOutboxes
    
    ConfigNodePropertyString draftDataService
    
    ConfigNodePropertyString draftMetadataService
    
    ConfigNodePropertyString submitDataService
    
    ConfigNodePropertyString submitMetadataService
    
    ConfigNodePropertyString pendingSignDataService
    
    ConfigNodePropertyString pendingSignMetadataService
}
