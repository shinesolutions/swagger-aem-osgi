import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamCoreImplReportsReportPurgeServiceProperties { 
  'scheduler.expression'?: ConfigNodePropertyString;
  maxSavedReports?: ConfigNodePropertyInteger;
  timeDuration?: ConfigNodePropertyInteger;
  enableReportPurge?: ConfigNodePropertyBoolean;
}

