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
import ComDayCqCommonsServletsRootMappingServletProperties from './ComDayCqCommonsServletsRootMappingServletProperties';

/**
 * The ComDayCqCommonsServletsRootMappingServletInfo model module.
 * @module model/ComDayCqCommonsServletsRootMappingServletInfo
 * @version 1.0.0
 */
class ComDayCqCommonsServletsRootMappingServletInfo {
    /**
     * Constructs a new <code>ComDayCqCommonsServletsRootMappingServletInfo</code>.
     * @alias module:model/ComDayCqCommonsServletsRootMappingServletInfo
     */
    constructor() { 
        
        ComDayCqCommonsServletsRootMappingServletInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqCommonsServletsRootMappingServletInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqCommonsServletsRootMappingServletInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqCommonsServletsRootMappingServletInfo} The populated <code>ComDayCqCommonsServletsRootMappingServletInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqCommonsServletsRootMappingServletInfo();

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
                obj['properties'] = ComDayCqCommonsServletsRootMappingServletProperties.constructFromObject(data['properties']);
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
ComDayCqCommonsServletsRootMappingServletInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqCommonsServletsRootMappingServletInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqCommonsServletsRootMappingServletInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqCommonsServletsRootMappingServletProperties} properties
 */
ComDayCqCommonsServletsRootMappingServletInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqCommonsServletsRootMappingServletInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqCommonsServletsRootMappingServletInfo.prototype['service_location'] = undefined;






export default ComDayCqCommonsServletsRootMappingServletInfo;

