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
import ComDayCqWcmMsmImplRolloutManagerImplProperties from './ComDayCqWcmMsmImplRolloutManagerImplProperties';

/**
 * The ComDayCqWcmMsmImplRolloutManagerImplInfo model module.
 * @module model/ComDayCqWcmMsmImplRolloutManagerImplInfo
 * @version 1.0.0
 */
class ComDayCqWcmMsmImplRolloutManagerImplInfo {
    /**
     * Constructs a new <code>ComDayCqWcmMsmImplRolloutManagerImplInfo</code>.
     * @alias module:model/ComDayCqWcmMsmImplRolloutManagerImplInfo
     */
    constructor() { 
        
        ComDayCqWcmMsmImplRolloutManagerImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmMsmImplRolloutManagerImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmMsmImplRolloutManagerImplInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmMsmImplRolloutManagerImplInfo} The populated <code>ComDayCqWcmMsmImplRolloutManagerImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmMsmImplRolloutManagerImplInfo();

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
                obj['properties'] = ComDayCqWcmMsmImplRolloutManagerImplProperties.constructFromObject(data['properties']);
            }
            if (data.hasOwnProperty('additionalProperties')) {
                obj['additionalProperties'] = ApiClient.convertToType(data['additionalProperties'], 'String');
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
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmMsmImplRolloutManagerImplProperties} properties
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['properties'] = undefined;

/**
 * @member {String} additionalProperties
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['additionalProperties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqWcmMsmImplRolloutManagerImplInfo.prototype['service_location'] = undefined;






export default ComDayCqWcmMsmImplRolloutManagerImplInfo;

