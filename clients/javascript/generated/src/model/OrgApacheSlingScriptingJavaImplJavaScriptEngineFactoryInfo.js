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
import OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties from './OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties';

/**
 * The OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo model module.
 * @module model/OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo
 * @version 1.0.0
 */
class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo {
    /**
     * Constructs a new <code>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</code>.
     * @alias module:model/OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo
     */
    constructor() { 
        
        OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo} The populated <code>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo();

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
                obj['properties'] = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.constructFromObject(data['properties']);
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
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties} properties
 */
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.prototype['service_location'] = undefined;






export default OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo;

