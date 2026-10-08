import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingTracerInternalLogTracerProperties { 
  tracerSets?: ConfigNodePropertyArray;
  enabled?: ConfigNodePropertyBoolean;
  servletEnabled?: ConfigNodePropertyBoolean;
  recordingCacheSizeInMB?: ConfigNodePropertyInteger;
  recordingCacheDurationInSecs?: ConfigNodePropertyInteger;
  recordingCompressionEnabled?: ConfigNodePropertyBoolean;
  gzipResponse?: ConfigNodePropertyBoolean;
}

