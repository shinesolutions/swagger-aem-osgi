import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';


export interface ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties { 
  translationFactory?: ConfigNodePropertyString;
  defaultConnectorLabel?: ConfigNodePropertyString;
  defaultConnectorAttribution?: ConfigNodePropertyString;
  defaultConnectorWorkspaceId?: ConfigNodePropertyString;
  defaultConnectorSubscriptionKey?: ConfigNodePropertyString;
  languageMapLocation?: ConfigNodePropertyString;
  categoryMapLocation?: ConfigNodePropertyString;
  retryAttempts?: ConfigNodePropertyInteger;
  timeoutCount?: ConfigNodePropertyInteger;
}

