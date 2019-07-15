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
import ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties from './ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties';

/**
 * The ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo model module.
 * @module model/ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo
 * @version 1.0.0
 */
class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</code>.
     * @alias module:model/ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo
     */
    constructor() { 
        
        ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo} The populated <code>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo();

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
                obj['properties'] = ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties} properties
 */
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.prototype['properties'] = undefined;






export default ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo;

