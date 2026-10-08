import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties { 
  name?: ConfigNodePropertyString;
  endpoints?: ConfigNodePropertyArray;
  'pull.items'?: ConfigNodePropertyInteger;
  'packageBuilder.target'?: ConfigNodePropertyString;
  'transportSecretProvider.target'?: ConfigNodePropertyString;
}

