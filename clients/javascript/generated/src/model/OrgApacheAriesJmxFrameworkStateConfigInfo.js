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
import OrgApacheAriesJmxFrameworkStateConfigProperties from './OrgApacheAriesJmxFrameworkStateConfigProperties';

/**
 * The OrgApacheAriesJmxFrameworkStateConfigInfo model module.
 * @module model/OrgApacheAriesJmxFrameworkStateConfigInfo
 * @version 1.0.0
 */
class OrgApacheAriesJmxFrameworkStateConfigInfo {
    /**
     * Constructs a new <code>OrgApacheAriesJmxFrameworkStateConfigInfo</code>.
     * @alias module:model/OrgApacheAriesJmxFrameworkStateConfigInfo
     */
    constructor() { 
        
        OrgApacheAriesJmxFrameworkStateConfigInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheAriesJmxFrameworkStateConfigInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheAriesJmxFrameworkStateConfigInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheAriesJmxFrameworkStateConfigInfo} The populated <code>OrgApacheAriesJmxFrameworkStateConfigInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheAriesJmxFrameworkStateConfigInfo();

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
                obj['properties'] = OrgApacheAriesJmxFrameworkStateConfigProperties.constructFromObject(data['properties']);
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
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheAriesJmxFrameworkStateConfigProperties} properties
 */
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheAriesJmxFrameworkStateConfigInfo.prototype['service_location'] = undefined;






export default OrgApacheAriesJmxFrameworkStateConfigInfo;

