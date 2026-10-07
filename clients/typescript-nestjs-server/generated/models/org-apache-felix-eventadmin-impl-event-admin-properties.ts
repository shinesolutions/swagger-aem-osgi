import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyFloat } from './config-node-property-float';


export interface OrgApacheFelixEventadminImplEventAdminProperties { 
  'org.apache.felix.eventadmin.ThreadPoolSize'?: ConfigNodePropertyInteger;
  'org.apache.felix.eventadmin.AsyncToSyncThreadRatio'?: ConfigNodePropertyFloat;
  'org.apache.felix.eventadmin.Timeout'?: ConfigNodePropertyInteger;
  'org.apache.felix.eventadmin.RequireTopic'?: ConfigNodePropertyBoolean;
  'org.apache.felix.eventadmin.IgnoreTimeout'?: ConfigNodePropertyArray;
  'org.apache.felix.eventadmin.IgnoreTopic'?: ConfigNodePropertyArray;
}

