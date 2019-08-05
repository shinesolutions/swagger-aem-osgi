package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
    ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths = null

    ConfigNodePropertyArray inboxImplTypeproviderLegacypaths = null

    ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem = null

    ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem = null

    ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask = null

}
