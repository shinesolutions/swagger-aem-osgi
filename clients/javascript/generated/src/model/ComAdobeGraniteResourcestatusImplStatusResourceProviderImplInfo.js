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
import ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties from './ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties';

/**
 * The ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo model module.
 * @module model/ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo
 * @version 1.0.0
 */
class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</code>.
     * @alias module:model/ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo
     */
    constructor() { 
        
        ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo} The populated <code>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo();

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
                obj['properties'] = ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties} properties
 */
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.prototype['properties'] = undefined;






export default ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo;

