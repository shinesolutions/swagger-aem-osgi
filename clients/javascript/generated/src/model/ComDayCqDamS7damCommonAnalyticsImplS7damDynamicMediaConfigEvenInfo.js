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
import ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties from './ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties';

/**
 * The ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo model module.
 * @module model/ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo
 * @version 1.0.0
 */
class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo {
    /**
     * Constructs a new <code>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</code>.
     * @alias module:model/ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo
     */
    constructor() { 
        
        ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo} The populated <code>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo();

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
                obj['properties'] = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties} properties
 */
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.prototype['properties'] = undefined;






export default ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo;

