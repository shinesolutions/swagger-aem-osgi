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
import OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties from './OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties';

/**
 * The OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo model module.
 * @module model/OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo
 * @version 1.0.0
 */
class OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo</code>.
     * @alias module:model/OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo
     */
    constructor() { 
        
        OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo} The populated <code>OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo();

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
                obj['properties'] = OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties} properties
 */
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.prototype['properties'] = undefined;






export default OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo;
