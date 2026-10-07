import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties { 
  asyncConfigs?: ConfigNodePropertyArray;
  leaseTimeOutMinutes?: ConfigNodePropertyInteger;
  failingIndexTimeoutSeconds?: ConfigNodePropertyInteger;
  errorWarnIntervalSeconds?: ConfigNodePropertyInteger;
}

