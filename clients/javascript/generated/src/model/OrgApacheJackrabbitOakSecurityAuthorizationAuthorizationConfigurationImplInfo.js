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
import OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplProperties from './OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplProperties';

/**
 * The OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo model module.
 * @module model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo</code>.
     * @alias module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo} The populated <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo();

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
                obj['properties'] = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplProperties.constructFromObject(data['properties']);
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
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplProperties} properties
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo.prototype['service_location'] = undefined;






export default OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImplInfo;

