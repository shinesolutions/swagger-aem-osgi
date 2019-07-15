/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
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
 * The OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties model module.
 * @module model/OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties} The populated <code>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties();

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
            if (data.hasOwnProperty('queue.processing.enabled')) {
                obj['queue.processing.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['queue.processing.enabled']);
            }
            if (data.hasOwnProperty('packageExporter.endpoints')) {
                obj['packageExporter.endpoints'] = ConfigNodePropertyArray.constructFromObject(data['packageExporter.endpoints']);
            }
            if (data.hasOwnProperty('pull.items')) {
                obj['pull.items'] = ConfigNodePropertyInteger.constructFromObject(data['pull.items']);
            }
            if (data.hasOwnProperty('http.conn.timeout')) {
                obj['http.conn.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['http.conn.timeout']);
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
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} title
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['title'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} details
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['details'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} serviceName
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['serviceName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} log.level
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['log.level'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} queue.processing.enabled
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['queue.processing.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} packageExporter.endpoints
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['packageExporter.endpoints'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} pull.items
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['pull.items'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} http.conn.timeout
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['http.conn.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} requestAuthorizationStrategy.target
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['requestAuthorizationStrategy.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} transportSecretProvider.target
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['transportSecretProvider.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} packageBuilder.target
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['packageBuilder.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} triggers.target
 */
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.prototype['triggers.target'] = undefined;






export default OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties;

