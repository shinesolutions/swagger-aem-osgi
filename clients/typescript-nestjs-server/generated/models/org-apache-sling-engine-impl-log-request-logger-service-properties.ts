import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingEngineImplLogRequestLoggerServiceProperties { 
  'request.log.service.format'?: ConfigNodePropertyString;
  'request.log.service.output'?: ConfigNodePropertyString;
  'request.log.service.outputtype'?: ConfigNodePropertyDropDown;
  'request.log.service.onentry'?: ConfigNodePropertyBoolean;
}

