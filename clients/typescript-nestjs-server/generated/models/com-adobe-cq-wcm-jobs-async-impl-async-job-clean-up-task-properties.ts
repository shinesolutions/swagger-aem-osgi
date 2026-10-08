import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';


export interface ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties { 
  'scheduler.expression'?: ConfigNodePropertyString;
  'job.purge.threshold'?: ConfigNodePropertyInteger;
  'job.purge.max.jobs'?: ConfigNodePropertyInteger;
}

