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
import ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties from './ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties';

/**
 * The ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo model module.
 * @module model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo
 * @version 1.0.0
 */
class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo {
    /**
     * Constructs a new <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</code>.
     * @alias module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo
     */
    constructor() { 
        
        ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo} The populated <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo();

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
                obj['properties'] = ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.constructFromObject(data['properties']);
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
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties} properties
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.prototype['service_location'] = undefined;






export default ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo;
