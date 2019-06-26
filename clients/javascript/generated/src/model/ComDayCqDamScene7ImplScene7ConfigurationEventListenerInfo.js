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
import ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties from './ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties';

/**
 * The ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo model module.
 * @module model/ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo
 * @version 1.0.0
 */
class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo {
    /**
     * Constructs a new <code>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</code>.
     * @alias module:model/ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo
     */
    constructor() { 
        
        ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo} The populated <code>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo();

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
                obj['properties'] = ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.constructFromObject(data['properties']);
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
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties} properties
 */
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.prototype['service_location'] = undefined;






export default ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo;
