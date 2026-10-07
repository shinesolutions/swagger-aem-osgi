import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamCoreImplExpiryNotificationJobImplProperties { 
  'cq.dam.expiry.notification.scheduler.istimebased'?: ConfigNodePropertyBoolean;
  'cq.dam.expiry.notification.scheduler.timebased.rule'?: ConfigNodePropertyString;
  'cq.dam.expiry.notification.scheduler.period.rule'?: ConfigNodePropertyInteger;
  send_email?: ConfigNodePropertyBoolean;
  asset_expired_limit?: ConfigNodePropertyInteger;
  prior_notification_seconds?: ConfigNodePropertyInteger;
  'cq.dam.expiry.notification.url.protocol'?: ConfigNodePropertyString;
}

