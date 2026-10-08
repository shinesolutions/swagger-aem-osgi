import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingEngineImplLogRequestLoggerProperties { 
  'request.log.output'?: ConfigNodePropertyString;
  'request.log.outputtype'?: ConfigNodePropertyDropDown;
  'request.log.enabled'?: ConfigNodePropertyBoolean;
  'access.log.output'?: ConfigNodePropertyString;
  'access.log.outputtype'?: ConfigNodePropertyDropDown;
  'access.log.enabled'?: ConfigNodePropertyBoolean;
}

