import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyFloat } from './config-node-property-float';


export interface ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties { 
  'jmx.objectname'?: ConfigNodePropertyString;
  'property.measure.enabled'?: ConfigNodePropertyBoolean;
  'property.name'?: ConfigNodePropertyString;
  'property.max.wait.ms'?: ConfigNodePropertyInteger;
  'property.max.rate'?: ConfigNodePropertyFloat;
  'fulltext.measure.enabled'?: ConfigNodePropertyBoolean;
  'fulltext.name'?: ConfigNodePropertyString;
  'fulltext.max.wait.ms'?: ConfigNodePropertyInteger;
  'fulltext.max.rate'?: ConfigNodePropertyFloat;
}

