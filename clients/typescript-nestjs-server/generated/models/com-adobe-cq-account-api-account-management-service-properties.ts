import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';


export interface ComAdobeCqAccountApiAccountManagementServiceProperties { 
  'cq.accountmanager.token.validity.period'?: ConfigNodePropertyInteger;
  'cq.accountmanager.config.requestnewaccount.mail'?: ConfigNodePropertyString;
  'cq.accountmanager.config.requestnewpwd.mail'?: ConfigNodePropertyString;
}

