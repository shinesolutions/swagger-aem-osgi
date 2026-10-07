import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamIdsImplIDSJobProcessorProperties { 
  'enable.multisession'?: ConfigNodePropertyBoolean;
  'ids.cc.enable'?: ConfigNodePropertyBoolean;
  'enable.retry'?: ConfigNodePropertyBoolean;
  'enable.retry.scripterror'?: ConfigNodePropertyBoolean;
  'externalizer.domain.cqhost'?: ConfigNodePropertyString;
  'externalizer.domain.http'?: ConfigNodePropertyString;
}

