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
import OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties from './OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties';

/**
 * The OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo model module.
 * @module model/OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo
 * @version 1.0.0
 */
class OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo {
    /**
     * Constructs a new <code>OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo</code>.
     * @alias module:model/OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo
     */
    constructor() { 
        
        OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo} The populated <code>OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo();

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
                obj['properties'] = OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.constructFromObject(data['properties']);
            }
            if (data.hasOwnProperty('bundle_location')) {
                obj['bundle_location'] = ApiClient.convertToType(data['bundle_location'], 'String');
            }
            if (data.hasOwnProperty('service_location')) {
                obj['service_location'] = ApiClient.convertToType(data['service_location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties} properties
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo.prototype['service_location'] = undefined;






export default OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo;

