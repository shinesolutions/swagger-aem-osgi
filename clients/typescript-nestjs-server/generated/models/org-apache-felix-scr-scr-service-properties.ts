import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheFelixScrScrServiceProperties { 
  'ds.loglevel'?: ConfigNodePropertyDropDown;
  'ds.factory.enabled'?: ConfigNodePropertyBoolean;
  'ds.delayed.keepInstances'?: ConfigNodePropertyBoolean;
  'ds.lock.timeout.milliseconds'?: ConfigNodePropertyInteger;
  'ds.stop.timeout.milliseconds'?: ConfigNodePropertyInteger;
  'ds.global.extender'?: ConfigNodePropertyBoolean;
}

