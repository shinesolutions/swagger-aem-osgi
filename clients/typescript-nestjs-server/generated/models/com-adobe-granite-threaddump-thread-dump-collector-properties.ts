import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeGraniteThreaddumpThreadDumpCollectorProperties { 
  'scheduler.period'?: ConfigNodePropertyInteger;
  'scheduler.runOn'?: ConfigNodePropertyDropDown;
  'granite.threaddump.enabled'?: ConfigNodePropertyBoolean;
  'granite.threaddump.dumpsPerFile'?: ConfigNodePropertyInteger;
  'granite.threaddump.enableGzipCompression'?: ConfigNodePropertyBoolean;
  'granite.threaddump.enableDirectoriesCompression'?: ConfigNodePropertyBoolean;
  'granite.threaddump.enableJStack'?: ConfigNodePropertyBoolean;
  'granite.threaddump.maxBackupDays'?: ConfigNodePropertyInteger;
  'granite.threaddump.backupCleanTrigger'?: ConfigNodePropertyString;
}

