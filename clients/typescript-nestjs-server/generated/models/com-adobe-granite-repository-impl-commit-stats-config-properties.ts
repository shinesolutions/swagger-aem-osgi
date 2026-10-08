import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteRepositoryImplCommitStatsConfigProperties { 
  enabled?: ConfigNodePropertyBoolean;
  intervalSeconds?: ConfigNodePropertyInteger;
  commitsPerIntervalThreshold?: ConfigNodePropertyInteger;
  maxLocationLength?: ConfigNodePropertyInteger;
  maxDetailsShown?: ConfigNodePropertyInteger;
  minDetailsPercentage?: ConfigNodePropertyInteger;
  threadMatchers?: ConfigNodePropertyArray;
  maxGreedyDepth?: ConfigNodePropertyInteger;
  greedyStackMatchers?: ConfigNodePropertyString;
  stackFilters?: ConfigNodePropertyArray;
  stackMatchers?: ConfigNodePropertyArray;
  stackCategorizers?: ConfigNodePropertyArray;
  stackShorteners?: ConfigNodePropertyArray;
}

