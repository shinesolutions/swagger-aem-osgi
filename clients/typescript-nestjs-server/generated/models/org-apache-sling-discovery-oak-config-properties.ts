import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingDiscoveryOakConfigProperties { 
  connectorPingTimeout?: ConfigNodePropertyInteger;
  connectorPingInterval?: ConfigNodePropertyInteger;
  discoveryLiteCheckInterval?: ConfigNodePropertyInteger;
  clusterSyncServiceTimeout?: ConfigNodePropertyInteger;
  clusterSyncServiceInterval?: ConfigNodePropertyInteger;
  enableSyncToken?: ConfigNodePropertyBoolean;
  minEventDelay?: ConfigNodePropertyInteger;
  socketConnectTimeout?: ConfigNodePropertyInteger;
  soTimeout?: ConfigNodePropertyInteger;
  topologyConnectorUrls?: ConfigNodePropertyArray;
  topologyConnectorWhitelist?: ConfigNodePropertyArray;
  autoStopLocalLoopEnabled?: ConfigNodePropertyBoolean;
  gzipConnectorRequestsEnabled?: ConfigNodePropertyBoolean;
  hmacEnabled?: ConfigNodePropertyBoolean;
  enableEncryption?: ConfigNodePropertyBoolean;
  sharedKey?: ConfigNodePropertyString;
  hmacSharedKeyTTL?: ConfigNodePropertyInteger;
  backoffStandbyFactor?: ConfigNodePropertyString;
  backoffStableFactor?: ConfigNodePropertyString;
}

