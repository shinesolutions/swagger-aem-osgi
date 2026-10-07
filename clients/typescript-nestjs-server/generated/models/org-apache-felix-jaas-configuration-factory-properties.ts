import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheFelixJaasConfigurationFactoryProperties { 
  'jaas.controlFlag'?: ConfigNodePropertyDropDown;
  'jaas.ranking'?: ConfigNodePropertyInteger;
  'jaas.realmName'?: ConfigNodePropertyString;
  'jaas.classname'?: ConfigNodePropertyString;
  'jaas.options'?: ConfigNodePropertyArray;
}

