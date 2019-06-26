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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties model module.
 * @module model/OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties} The populated <code>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();

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
            if (data.hasOwnProperty('packageExporter.target')) {
                obj['packageExporter.target'] = ConfigNodePropertyString.constructFromObject(data['packageExporter.target']);
            }
            if (data.hasOwnProperty('packageImporter.target')) {
                obj['packageImporter.target'] = ConfigNodePropertyString.constructFromObject(data['packageImporter.target']);
            }
            if (data.hasOwnProperty('requestAuthorizationStrategy.target')) {
                obj['requestAuthorizationStrategy.target'] = ConfigNodePropertyString.constructFromObject(data['requestAuthorizationStrategy.target']);
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
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} title
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['title'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} details
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['details'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} serviceName
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['serviceName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} log.level
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['log.level'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} queue.processing.enabled
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['queue.processing.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} packageExporter.target
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['packageExporter.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} packageImporter.target
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['packageImporter.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} requestAuthorizationStrategy.target
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['requestAuthorizationStrategy.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} triggers.target
 */
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.prototype['triggers.target'] = undefined;






export default OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties;

