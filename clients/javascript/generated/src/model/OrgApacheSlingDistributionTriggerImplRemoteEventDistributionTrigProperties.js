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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties model module.
 * @module model/OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties} The populated <code>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('endpoint')) {
                obj['endpoint'] = ConfigNodePropertyString.constructFromObject(data['endpoint']);
            }
            if (data.hasOwnProperty('transportSecretProvider.target')) {
                obj['transportSecretProvider.target'] = ConfigNodePropertyString.constructFromObject(data['transportSecretProvider.target']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} endpoint
 */
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.prototype['endpoint'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} transportSecretProvider.target
 */
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.prototype['transportSecretProvider.target'] = undefined;






export default OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties;
