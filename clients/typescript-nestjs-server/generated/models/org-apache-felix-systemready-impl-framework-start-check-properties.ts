import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties { 
  timeout?: ConfigNodePropertyInteger;
  'target.start.level'?: ConfigNodePropertyInteger;
  'target.start.level.prop.name'?: ConfigNodePropertyString;
  type?: ConfigNodePropertyDropDown;
}

