import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties { 
  datasources?: ConfigNodePropertyArray;
  step?: ConfigNodePropertyInteger;
  archives?: ConfigNodePropertyArray;
  path?: ConfigNodePropertyString;
}

