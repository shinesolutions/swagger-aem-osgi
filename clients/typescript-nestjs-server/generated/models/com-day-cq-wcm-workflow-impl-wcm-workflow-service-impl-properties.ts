import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties { 
  'event.filter'?: ConfigNodePropertyString;
  minThreadPoolSize?: ConfigNodePropertyInteger;
  maxThreadPoolSize?: ConfigNodePropertyInteger;
  'cq.wcm.workflow.terminate.on.activate'?: ConfigNodePropertyBoolean;
  'cq.wcm.worklfow.terminate.exclusion.list'?: ConfigNodePropertyArray;
}

