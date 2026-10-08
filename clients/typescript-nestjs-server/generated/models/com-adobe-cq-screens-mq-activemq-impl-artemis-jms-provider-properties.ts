import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';
import { ConfigNodePropertyFloat } from './config-node-property-float';


export interface ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties { 
  'service.ranking'?: ConfigNodePropertyInteger;
  'global.size'?: ConfigNodePropertyInteger;
  'max.disk.usage'?: ConfigNodePropertyInteger;
  'persistence.enabled'?: ConfigNodePropertyBoolean;
  'thread.pool.max.size'?: ConfigNodePropertyInteger;
  'scheduled.thread.pool.max.size'?: ConfigNodePropertyInteger;
  'graceful.shutdown.timeout'?: ConfigNodePropertyInteger;
  queues?: ConfigNodePropertyArray;
  topics?: ConfigNodePropertyArray;
  'addresses.max.delivery.attempts'?: ConfigNodePropertyInteger;
  'addresses.expiry.delay'?: ConfigNodePropertyInteger;
  'addresses.address.full.message.policy'?: ConfigNodePropertyDropDown;
  'addresses.max.size.bytes'?: ConfigNodePropertyInteger;
  'addresses.page.size.bytes'?: ConfigNodePropertyInteger;
  'addresses.page.cache.max.size'?: ConfigNodePropertyInteger;
  'cluster.user'?: ConfigNodePropertyString;
  'cluster.password'?: ConfigNodePropertyString;
  'cluster.call.timeout'?: ConfigNodePropertyInteger;
  'cluster.call.failover.timeout'?: ConfigNodePropertyInteger;
  'cluster.client.failure.check.period'?: ConfigNodePropertyInteger;
  'cluster.notification.attempts'?: ConfigNodePropertyInteger;
  'cluster.notification.interval'?: ConfigNodePropertyInteger;
  'id.cache.size'?: ConfigNodePropertyInteger;
  'cluster.confirmation.window.size'?: ConfigNodePropertyInteger;
  'cluster.connection.ttl'?: ConfigNodePropertyInteger;
  'cluster.duplicate.detection'?: ConfigNodePropertyBoolean;
  'cluster.initial.connect.attempts'?: ConfigNodePropertyInteger;
  'cluster.max.retry.interval'?: ConfigNodePropertyInteger;
  'cluster.min.large.message.size'?: ConfigNodePropertyInteger;
  'cluster.producer.window.size'?: ConfigNodePropertyInteger;
  'cluster.reconnect.attempts'?: ConfigNodePropertyInteger;
  'cluster.retry.interval'?: ConfigNodePropertyInteger;
  'cluster.retry.interval.multiplier'?: ConfigNodePropertyFloat;
}

