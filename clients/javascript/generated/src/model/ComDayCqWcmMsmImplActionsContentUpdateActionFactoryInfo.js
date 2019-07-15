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
import ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties from './ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties';

/**
 * The ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo model module.
 * @module model/ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo
 * @version 1.0.0
 */
class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo {
    /**
     * Constructs a new <code>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo</code>.
     * @alias module:model/ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo
     */
    constructor() { 
        
        ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo} The populated <code>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo();

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
                obj['properties'] = ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.constructFromObject(data['properties']);
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
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties} properties
 */
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo.prototype['service_location'] = undefined;






export default ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo;

