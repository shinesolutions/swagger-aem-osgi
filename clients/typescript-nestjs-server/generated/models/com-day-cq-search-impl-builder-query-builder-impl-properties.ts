import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqSearchImplBuilderQueryBuilderImplProperties { 
  'excerpt.properties'?: ConfigNodePropertyArray;
  'cache.max.entries'?: ConfigNodePropertyInteger;
  'cache.entry.lifetime'?: ConfigNodePropertyInteger;
  'xpath.union'?: ConfigNodePropertyBoolean;
}

