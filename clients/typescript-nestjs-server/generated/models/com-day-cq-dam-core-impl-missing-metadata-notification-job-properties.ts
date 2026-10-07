import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamCoreImplMissingMetadataNotificationJobProperties { 
  'cq.dam.missingmetadata.notification.scheduler.istimebased'?: ConfigNodePropertyBoolean;
  'cq.dam.missingmetadata.notification.scheduler.timebased.rule'?: ConfigNodePropertyString;
  'cq.dam.missingmetadata.notification.scheduler.period.rule'?: ConfigNodePropertyInteger;
  'cq.dam.missingmetadata.notification.recipient'?: ConfigNodePropertyString;
}

