import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheFelixJaasConfigurationSpiProperties { 
  'jaas.defaultRealmName'?: ConfigNodePropertyString;
  'jaas.configProviderName'?: ConfigNodePropertyString;
  'jaas.globalConfigPolicy'?: ConfigNodePropertyDropDown;
}

