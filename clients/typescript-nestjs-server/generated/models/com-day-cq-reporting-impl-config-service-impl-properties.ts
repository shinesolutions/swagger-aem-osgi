import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqReportingImplConfigServiceImplProperties { 
  'repconf.timezone'?: ConfigNodePropertyString;
  'repconf.locale'?: ConfigNodePropertyString;
  'repconf.snapshots'?: ConfigNodePropertyString;
  'repconf.repdir'?: ConfigNodePropertyString;
  'repconf.hourofday'?: ConfigNodePropertyInteger;
  'repconf.minofhour'?: ConfigNodePropertyInteger;
  'repconf.maxrows'?: ConfigNodePropertyInteger;
  'repconf.fakedata'?: ConfigNodePropertyBoolean;
  'repconf.snapshotuser'?: ConfigNodePropertyString;
  'repconf.enforcesnapshotuser'?: ConfigNodePropertyBoolean;
}

