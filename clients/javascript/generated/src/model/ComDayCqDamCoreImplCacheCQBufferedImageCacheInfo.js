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
import ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties from './ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties';

/**
 * The ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo model module.
 * @module model/ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo
 * @version 1.0.0
 */
class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</code>.
     * @alias module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo
     */
    constructor() { 
        
        ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo} The populated <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo();

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
                obj['properties'] = ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties} properties
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.prototype['properties'] = undefined;






export default ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo;
