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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties model module.
 * @module model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties} The populated <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ConfigNodePropertyString.constructFromObject(data['title']);
            }
            if (data.hasOwnProperty('details')) {
                obj['details'] = ConfigNodePropertyString.constructFromObject(data['details']);
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
            if (data.hasOwnProperty('serviceName')) {
                obj['serviceName'] = ConfigNodePropertyString.constructFromObject(data['serviceName']);
            }
            if (data.hasOwnProperty('log.level')) {
                obj['log.level'] = ConfigNodePropertyDropDown.constructFromObject(data['log.level']);
            }
            if (data.hasOwnProperty('allowed.roots')) {
                obj['allowed.roots'] = ConfigNodePropertyArray.constructFromObject(data['allowed.roots']);
            }
            if (data.hasOwnProperty('queue.processing.enabled')) {
                obj['queue.processing.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['queue.processing.enabled']);
            }
            if (data.hasOwnProperty('packageImporter.endpoints')) {
                obj['packageImporter.endpoints'] = ConfigNodePropertyArray.constructFromObject(data['packageImporter.endpoints']);
            }
            if (data.hasOwnProperty('passiveQueues')) {
                obj['passiveQueues'] = ConfigNodePropertyArray.constructFromObject(data['passiveQueues']);
            }
            if (data.hasOwnProperty('priorityQueues')) {
                obj['priorityQueues'] = ConfigNodePropertyArray.constructFromObject(data['priorityQueues']);
            }
            if (data.hasOwnProperty('retry.strategy')) {
                obj['retry.strategy'] = ConfigNodePropertyDropDown.constructFromObject(data['retry.strategy']);
            }
            if (data.hasOwnProperty('retry.attempts')) {
                obj['retry.attempts'] = ConfigNodePropertyInteger.constructFromObject(data['retry.attempts']);
            }
            if (data.hasOwnProperty('requestAuthorizationStrategy.target')) {
                obj['requestAuthorizationStrategy.target'] = ConfigNodePropertyString.constructFromObject(data['requestAuthorizationStrategy.target']);
            }
            if (data.hasOwnProperty('transportSecretProvider.target')) {
                obj['transportSecretProvider.target'] = ConfigNodePropertyString.constructFromObject(data['transportSecretProvider.target']);
            }
            if (data.hasOwnProperty('packageBuilder.target')) {
                obj['packageBuilder.target'] = ConfigNodePropertyString.constructFromObject(data['packageBuilder.target']);
            }
            if (data.hasOwnProperty('triggers.target')) {
                obj['triggers.target'] = ConfigNodePropertyString.constructFromObject(data['triggers.target']);
            }
            if (data.hasOwnProperty('queue.provider')) {
                obj['queue.provider'] = ConfigNodePropertyDropDown.constructFromObject(data['queue.provider']);
            }
            if (data.hasOwnProperty('async.delivery')) {
                obj['async.delivery'] = ConfigNodePropertyBoolean.constructFromObject(data['async.delivery']);
            }
            if (data.hasOwnProperty('http.conn.timeout')) {
                obj['http.conn.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['http.conn.timeout']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} title
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['title'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} details
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['details'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} serviceName
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['serviceName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} log.level
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['log.level'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} allowed.roots
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['allowed.roots'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} queue.processing.enabled
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['queue.processing.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} packageImporter.endpoints
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['packageImporter.endpoints'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} passiveQueues
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['passiveQueues'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} priorityQueues
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['priorityQueues'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} retry.strategy
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['retry.strategy'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} retry.attempts
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['retry.attempts'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} requestAuthorizationStrategy.target
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['requestAuthorizationStrategy.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} transportSecretProvider.target
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['transportSecretProvider.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} packageBuilder.target
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['packageBuilder.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} triggers.target
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['triggers.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} queue.provider
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['queue.provider'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} async.delivery
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['async.delivery'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} http.conn.timeout
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.prototype['http.conn.timeout'] = undefined;






export default OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties;
