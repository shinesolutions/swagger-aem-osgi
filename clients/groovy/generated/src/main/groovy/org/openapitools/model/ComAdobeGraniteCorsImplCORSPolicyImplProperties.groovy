package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteCorsImplCORSPolicyImplProperties {
    ConfigNodePropertyArray alloworigin = null

    ConfigNodePropertyArray alloworiginregexp = null

    ConfigNodePropertyArray allowedpaths = null

    ConfigNodePropertyArray exposedheaders = null

    ConfigNodePropertyInteger maxage = null

    ConfigNodePropertyArray supportedheaders = null

    ConfigNodePropertyArray supportedmethods = null

    ConfigNodePropertyBoolean supportscredentials = null

}
