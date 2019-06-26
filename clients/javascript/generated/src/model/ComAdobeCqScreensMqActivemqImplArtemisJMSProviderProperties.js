/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyFloat from './ConfigNodePropertyFloat';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties model module.
 * @module model/ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
 * @version 1.0.0
 */
class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    /**
     * Constructs a new <code>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</code>.
     * @alias module:model/ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
     */
    constructor() { 
        
        ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties} The populated <code>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties();

            if (data.hasOwnProperty('service.ranking')) {
                obj['service.ranking'] = ConfigNodePropertyInteger.constructFromObject(data['service.ranking']);
            }
            if (data.hasOwnProperty('global.size')) {
                obj['global.size'] = ConfigNodePropertyInteger.constructFromObject(data['global.size']);
            }
            if (data.hasOwnProperty('max.disk.usage')) {
                obj['max.disk.usage'] = ConfigNodePropertyInteger.constructFromObject(data['max.disk.usage']);
            }
            if (data.hasOwnProperty('persistence.enabled')) {
                obj['persistence.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['persistence.enabled']);
            }
            if (data.hasOwnProperty('thread.pool.max.size')) {
                obj['thread.pool.max.size'] = ConfigNodePropertyInteger.constructFromObject(data['thread.pool.max.size']);
            }
            if (data.hasOwnProperty('scheduled.thread.pool.max.size')) {
                obj['scheduled.thread.pool.max.size'] = ConfigNodePropertyInteger.constructFromObject(data['scheduled.thread.pool.max.size']);
            }
            if (data.hasOwnProperty('graceful.shutdown.timeout')) {
                obj['graceful.shutdown.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['graceful.shutdown.timeout']);
            }
            if (data.hasOwnProperty('queues')) {
                obj['queues'] = ConfigNodePropertyArray.constructFromObject(data['queues']);
            }
            if (data.hasOwnProperty('topics')) {
                obj['topics'] = ConfigNodePropertyArray.constructFromObject(data['topics']);
            }
            if (data.hasOwnProperty('addresses.max.delivery.attempts')) {
                obj['addresses.max.delivery.attempts'] = ConfigNodePropertyInteger.constructFromObject(data['addresses.max.delivery.attempts']);
            }
            if (data.hasOwnProperty('addresses.expiry.delay')) {
                obj['addresses.expiry.delay'] = ConfigNodePropertyInteger.constructFromObject(data['addresses.expiry.delay']);
            }
            if (data.hasOwnProperty('addresses.address.full.message.policy')) {
                obj['addresses.address.full.message.policy'] = ConfigNodePropertyDropDown.constructFromObject(data['addresses.address.full.message.policy']);
            }
            if (data.hasOwnProperty('addresses.max.size.bytes')) {
                obj['addresses.max.size.bytes'] = ConfigNodePropertyInteger.constructFromObject(data['addresses.max.size.bytes']);
            }
            if (data.hasOwnProperty('addresses.page.size.bytes')) {
                obj['addresses.page.size.bytes'] = ConfigNodePropertyInteger.constructFromObject(data['addresses.page.size.bytes']);
            }
            if (data.hasOwnProperty('addresses.page.cache.max.size')) {
                obj['addresses.page.cache.max.size'] = ConfigNodePropertyInteger.constructFromObject(data['addresses.page.cache.max.size']);
            }
            if (data.hasOwnProperty('cluster.user')) {
                obj['cluster.user'] = ConfigNodePropertyString.constructFromObject(data['cluster.user']);
            }
            if (data.hasOwnProperty('cluster.password')) {
                obj['cluster.password'] = ConfigNodePropertyString.constructFromObject(data['cluster.password']);
            }
            if (data.hasOwnProperty('cluster.call.timeout')) {
                obj['cluster.call.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.call.timeout']);
            }
            if (data.hasOwnProperty('cluster.call.failover.timeout')) {
                obj['cluster.call.failover.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.call.failover.timeout']);
            }
            if (data.hasOwnProperty('cluster.client.failure.check.period')) {
                obj['cluster.client.failure.check.period'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.client.failure.check.period']);
            }
            if (data.hasOwnProperty('cluster.notification.attempts')) {
                obj['cluster.notification.attempts'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.notification.attempts']);
            }
            if (data.hasOwnProperty('cluster.notification.interval')) {
                obj['cluster.notification.interval'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.notification.interval']);
            }
            if (data.hasOwnProperty('id.cache.size')) {
                obj['id.cache.size'] = ConfigNodePropertyInteger.constructFromObject(data['id.cache.size']);
            }
            if (data.hasOwnProperty('cluster.confirmation.window.size')) {
                obj['cluster.confirmation.window.size'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.confirmation.window.size']);
            }
            if (data.hasOwnProperty('cluster.connection.ttl')) {
                obj['cluster.connection.ttl'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.connection.ttl']);
            }
            if (data.hasOwnProperty('cluster.duplicate.detection')) {
                obj['cluster.duplicate.detection'] = ConfigNodePropertyBoolean.constructFromObject(data['cluster.duplicate.detection']);
            }
            if (data.hasOwnProperty('cluster.initial.connect.attempts')) {
                obj['cluster.initial.connect.attempts'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.initial.connect.attempts']);
            }
            if (data.hasOwnProperty('cluster.max.retry.interval')) {
                obj['cluster.max.retry.interval'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.max.retry.interval']);
            }
            if (data.hasOwnProperty('cluster.min.large.message.size')) {
                obj['cluster.min.large.message.size'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.min.large.message.size']);
            }
            if (data.hasOwnProperty('cluster.producer.window.size')) {
                obj['cluster.producer.window.size'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.producer.window.size']);
            }
            if (data.hasOwnProperty('cluster.reconnect.attempts')) {
                obj['cluster.reconnect.attempts'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.reconnect.attempts']);
            }
            if (data.hasOwnProperty('cluster.retry.interval')) {
                obj['cluster.retry.interval'] = ConfigNodePropertyInteger.constructFromObject(data['cluster.retry.interval']);
            }
            if (data.hasOwnProperty('cluster.retry.interval.multiplier')) {
                obj['cluster.retry.interval.multiplier'] = ConfigNodePropertyFloat.constructFromObject(data['cluster.retry.interval.multiplier']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['service.ranking'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} global.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['global.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} max.disk.usage
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['max.disk.usage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} persistence.enabled
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['persistence.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} thread.pool.max.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['thread.pool.max.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} scheduled.thread.pool.max.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['scheduled.thread.pool.max.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} graceful.shutdown.timeout
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['graceful.shutdown.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} queues
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['queues'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} topics
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['topics'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} addresses.max.delivery.attempts
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.max.delivery.attempts'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} addresses.expiry.delay
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.expiry.delay'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} addresses.address.full.message.policy
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.address.full.message.policy'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} addresses.max.size.bytes
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.max.size.bytes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} addresses.page.size.bytes
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.page.size.bytes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} addresses.page.cache.max.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['addresses.page.cache.max.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cluster.user
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.user'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cluster.password
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.password'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.call.timeout
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.call.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.call.failover.timeout
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.call.failover.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.client.failure.check.period
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.client.failure.check.period'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.notification.attempts
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.notification.attempts'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.notification.interval
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.notification.interval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} id.cache.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['id.cache.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.confirmation.window.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.confirmation.window.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.connection.ttl
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.connection.ttl'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cluster.duplicate.detection
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.duplicate.detection'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.initial.connect.attempts
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.initial.connect.attempts'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.max.retry.interval
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.max.retry.interval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.min.large.message.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.min.large.message.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.producer.window.size
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.producer.window.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.reconnect.attempts
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.reconnect.attempts'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cluster.retry.interval
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.retry.interval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyFloat} cluster.retry.interval.multiplier
 */
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.prototype['cluster.retry.interval.multiplier'] = undefined;






export default ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties;

