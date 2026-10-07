import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties { 
  'com.adobe.cq.screens.analytics.impl.url'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.analytics.impl.apikey'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.analytics.impl.project'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.analytics.impl.environment'?: ConfigNodePropertyDropDown;
  'com.adobe.cq.screens.analytics.impl.sendFrequency'?: ConfigNodePropertyInteger;
}

