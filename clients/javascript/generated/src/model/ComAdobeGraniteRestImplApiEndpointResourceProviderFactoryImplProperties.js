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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties model module.
 * @module model/ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
 * @version 1.0.0
 */
class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</code>.
     * @alias module:model/ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
     */
    constructor() { 
        
        ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties} The populated <code>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();

            if (data.hasOwnProperty('provider.roots')) {
                obj['provider.roots'] = ConfigNodePropertyString.constructFromObject(data['provider.roots']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} provider.roots
 */
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.prototype['provider.roots'] = undefined;






export default ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties;
