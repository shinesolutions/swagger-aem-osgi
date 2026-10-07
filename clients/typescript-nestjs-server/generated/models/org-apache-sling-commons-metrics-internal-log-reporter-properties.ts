import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingCommonsMetricsInternalLogReporterProperties { 
  period?: ConfigNodePropertyInteger;
  timeUnit?: ConfigNodePropertyDropDown;
  level?: ConfigNodePropertyDropDown;
  loggerName?: ConfigNodePropertyString;
  prefix?: ConfigNodePropertyString;
  pattern?: ConfigNodePropertyString;
  registryName?: ConfigNodePropertyString;
}

