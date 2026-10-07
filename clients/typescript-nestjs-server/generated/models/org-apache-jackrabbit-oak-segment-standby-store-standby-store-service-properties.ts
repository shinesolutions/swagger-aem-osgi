import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties { 
  'org.apache.sling.installer.configuration.persist'?: ConfigNodePropertyBoolean;
  mode?: ConfigNodePropertyDropDown;
  port?: ConfigNodePropertyInteger;
  'primary.host'?: ConfigNodePropertyString;
  interval?: ConfigNodePropertyInteger;
  'primary.allowed-client-ip-ranges'?: ConfigNodePropertyArray;
  secure?: ConfigNodePropertyBoolean;
  'standby.readtimeout'?: ConfigNodePropertyInteger;
  'standby.autoclean'?: ConfigNodePropertyBoolean;
}

