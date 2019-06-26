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
import OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties from './OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties';

/**
 * The OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo model module.
 * @module model/OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</code>.
     * @alias module:model/OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo} The populated <code>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo();

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
                obj['properties'] = OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.constructFromObject(data['properties']);
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
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties} properties
 */
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.prototype['service_location'] = undefined;






export default OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo;

