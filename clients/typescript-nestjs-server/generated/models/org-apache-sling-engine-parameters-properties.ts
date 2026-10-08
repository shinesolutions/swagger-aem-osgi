import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheSlingEngineParametersProperties { 
  'sling.default.parameter.encoding'?: ConfigNodePropertyString;
  'sling.default.max.parameters'?: ConfigNodePropertyInteger;
  'file.location'?: ConfigNodePropertyString;
  'file.threshold'?: ConfigNodePropertyInteger;
  'file.max'?: ConfigNodePropertyInteger;
  'request.max'?: ConfigNodePropertyInteger;
  'sling.default.parameter.checkForAdditionalContainerParameters'?: ConfigNodePropertyBoolean;
}

