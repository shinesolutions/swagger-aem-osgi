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
import OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties from './OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties';

/**
 * The OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo model module.
 * @module model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo
 * @version 1.0.0
 */
class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo</code>.
     * @alias module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo
     */
    constructor() { 
        
        OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo} The populated <code>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties} properties
 */
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo.prototype['properties'] = undefined;






export default OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryInfo;

