import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties { 
  name?: ConfigNodePropertyString;
  minPoolSize?: ConfigNodePropertyInteger;
  maxPoolSize?: ConfigNodePropertyInteger;
  queueSize?: ConfigNodePropertyInteger;
  maxThreadAge?: ConfigNodePropertyInteger;
  keepAliveTime?: ConfigNodePropertyInteger;
  blockPolicy?: ConfigNodePropertyDropDown;
  shutdownGraceful?: ConfigNodePropertyBoolean;
  daemon?: ConfigNodePropertyBoolean;
  shutdownWaitTime?: ConfigNodePropertyInteger;
  priority?: ConfigNodePropertyDropDown;
}

