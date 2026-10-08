import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';


export interface OrgApacheSlingModelsImplModelAdapterFactoryProperties { 
  'osgi.http.whiteboard.listener'?: ConfigNodePropertyString;
  'osgi.http.whiteboard.context.select'?: ConfigNodePropertyString;
  'max.recursion.depth'?: ConfigNodePropertyInteger;
  'cleanup.job.period'?: ConfigNodePropertyInteger;
}

