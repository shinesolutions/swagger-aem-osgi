import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqAuditPurgeReplicationProperties { 
  'auditlog.rule.name'?: ConfigNodePropertyString;
  'auditlog.rule.contentpath'?: ConfigNodePropertyString;
  'auditlog.rule.minimumage'?: ConfigNodePropertyInteger;
  'auditlog.rule.types'?: ConfigNodePropertyDropDown;
}

