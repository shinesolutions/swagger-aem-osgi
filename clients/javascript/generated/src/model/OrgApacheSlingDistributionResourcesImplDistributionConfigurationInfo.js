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
import OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties from './OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties';

/**
 * The OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo model module.
 * @module model/OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
 * @version 1.0.0
 */
class OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</code>.
     * @alias module:model/OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
     */
    constructor() { 
        
        OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo} The populated <code>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo();

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
                obj['properties'] = OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties} properties
 */
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.prototype['properties'] = undefined;






export default OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo;

