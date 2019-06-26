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
import ComDayCqDamCoreImplServletCreateAssetServletProperties from './ComDayCqDamCoreImplServletCreateAssetServletProperties';

/**
 * The ComDayCqDamCoreImplServletCreateAssetServletInfo model module.
 * @module model/ComDayCqDamCoreImplServletCreateAssetServletInfo
 * @version 1.0.0
 */
class ComDayCqDamCoreImplServletCreateAssetServletInfo {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplServletCreateAssetServletInfo</code>.
     * @alias module:model/ComDayCqDamCoreImplServletCreateAssetServletInfo
     */
    constructor() { 
        
        ComDayCqDamCoreImplServletCreateAssetServletInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplServletCreateAssetServletInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplServletCreateAssetServletInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplServletCreateAssetServletInfo} The populated <code>ComDayCqDamCoreImplServletCreateAssetServletInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplServletCreateAssetServletInfo();

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
                obj['properties'] = ComDayCqDamCoreImplServletCreateAssetServletProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamCoreImplServletCreateAssetServletInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamCoreImplServletCreateAssetServletInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamCoreImplServletCreateAssetServletInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamCoreImplServletCreateAssetServletProperties} properties
 */
ComDayCqDamCoreImplServletCreateAssetServletInfo.prototype['properties'] = undefined;






export default ComDayCqDamCoreImplServletCreateAssetServletInfo;

