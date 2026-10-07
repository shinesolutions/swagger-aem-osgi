package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
    
    ConfigNodePropertyString translationFactory
    
    ConfigNodePropertyString defaultConnectorLabel
    
    ConfigNodePropertyString defaultConnectorAttribution
    
    ConfigNodePropertyString defaultConnectorWorkspaceId
    
    ConfigNodePropertyString defaultConnectorSubscriptionKey
    
    ConfigNodePropertyString languageMapLocation
    
    ConfigNodePropertyString categoryMapLocation
    
    ConfigNodePropertyInteger retryAttempts
    
    ConfigNodePropertyInteger timeoutCount
}
