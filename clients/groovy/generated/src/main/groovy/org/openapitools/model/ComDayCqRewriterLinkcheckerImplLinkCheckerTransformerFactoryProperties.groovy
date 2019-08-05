package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting = null

    ConfigNodePropertyBoolean linkcheckertransformerDisableChecking = null

    ConfigNodePropertyInteger linkcheckertransformerMapCacheSize = null

    ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck = null

    ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension = null

    ConfigNodePropertyArray linkcheckertransformerRewriteElements = null

    ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist = null

}
