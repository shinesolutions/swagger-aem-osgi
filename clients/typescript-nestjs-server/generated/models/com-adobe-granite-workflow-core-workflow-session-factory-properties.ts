import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties { 
  'granite.workflowinbox.sort.propertyName'?: ConfigNodePropertyDropDown;
  'granite.workflowinbox.sort.order'?: ConfigNodePropertyString;
  'cq.workflow.job.retry'?: ConfigNodePropertyInteger;
  'cq.workflow.superuser'?: ConfigNodePropertyArray;
  'granite.workflow.inboxQuerySize'?: ConfigNodePropertyInteger;
  'granite.workflow.adminUserGroupFilter'?: ConfigNodePropertyBoolean;
  'granite.workflow.enforceWorkitemAssigneePermissions'?: ConfigNodePropertyBoolean;
  'granite.workflow.enforceWorkflowInitiatorPermissions'?: ConfigNodePropertyBoolean;
  'granite.workflow.injectTenantIdInJobTopics'?: ConfigNodePropertyBoolean;
  'granite.workflow.maxPurgeSaveThreshold'?: ConfigNodePropertyInteger;
  'granite.workflow.maxPurgeQueryCount'?: ConfigNodePropertyInteger;
}

