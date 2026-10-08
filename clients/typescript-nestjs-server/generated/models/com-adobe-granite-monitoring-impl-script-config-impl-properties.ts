import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteMonitoringImplScriptConfigImplProperties { 
  'script.filename'?: ConfigNodePropertyString;
  'script.display'?: ConfigNodePropertyString;
  'script.path'?: ConfigNodePropertyString;
  'script.platform'?: ConfigNodePropertyArray;
  interval?: ConfigNodePropertyInteger;
  jmxdomain?: ConfigNodePropertyString;
}

