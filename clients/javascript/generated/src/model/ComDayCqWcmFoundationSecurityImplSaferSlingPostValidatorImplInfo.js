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
import ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties from './ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties';

/**
 * The ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo model module.
 * @module model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo
 * @version 1.0.0
 */
class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo {
    /**
     * Constructs a new <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</code>.
     * @alias module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo
     */
    constructor() { 
        
        ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo} The populated <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo();

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
                obj['properties'] = ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.constructFromObject(data['properties']);
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
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties} properties
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.prototype['service_location'] = undefined;






export default ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo;

