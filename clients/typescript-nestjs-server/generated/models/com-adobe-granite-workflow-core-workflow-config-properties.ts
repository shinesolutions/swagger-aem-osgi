import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteWorkflowCoreWorkflowConfigProperties { 
  'cq.workflow.config.workflow.packages.root.path'?: ConfigNodePropertyArray;
  'cq.workflow.config.workflow.process.legacy.mode'?: ConfigNodePropertyBoolean;
  'cq.workflow.config.allow.locking'?: ConfigNodePropertyBoolean;
}

