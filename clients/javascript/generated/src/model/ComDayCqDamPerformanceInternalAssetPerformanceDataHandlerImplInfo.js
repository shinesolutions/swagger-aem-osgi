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
import ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties from './ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties';

/**
 * The ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo model module.
 * @module model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo
 * @version 1.0.0
 */
class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo {
    /**
     * Constructs a new <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</code>.
     * @alias module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo
     */
    constructor() { 
        
        ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo} The populated <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo();

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
                obj['properties'] = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties} properties
 */
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.prototype['properties'] = undefined;






export default ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo;
