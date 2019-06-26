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
import ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties from './ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties';

/**
 * The ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo model module.
 * @module model/ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo
 * @version 1.0.0
 */
class ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</code>.
     * @alias module:model/ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo
     */
    constructor() { 
        
        ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo} The populated <code>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo();

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
                obj['properties'] = ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties} properties
 */
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.prototype['properties'] = undefined;






export default ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo;

