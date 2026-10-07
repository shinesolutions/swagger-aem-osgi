package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    
    ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting
    
    ConfigNodePropertyBoolean linkcheckertransformerDisableChecking
    
    ConfigNodePropertyInteger linkcheckertransformerMapCacheSize
    
    ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck
    
    ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension
    
    ConfigNodePropertyArray linkcheckertransformerRewriteElements
    
    ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist
}
