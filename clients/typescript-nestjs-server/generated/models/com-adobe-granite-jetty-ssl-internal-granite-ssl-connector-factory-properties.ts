import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties { 
  'com.adobe.granite.jetty.ssl.port'?: ConfigNodePropertyInteger;
  'com.adobe.granite.jetty.ssl.keystore.user'?: ConfigNodePropertyString;
  'com.adobe.granite.jetty.ssl.keystore.password'?: ConfigNodePropertyString;
  'com.adobe.granite.jetty.ssl.ciphersuites.excluded'?: ConfigNodePropertyArray;
  'com.adobe.granite.jetty.ssl.ciphersuites.included'?: ConfigNodePropertyArray;
  'com.adobe.granite.jetty.ssl.client.certificate'?: ConfigNodePropertyDropDown;
}

