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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';

/**
 * The ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties model module.
 * @module model/ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</code>.
     * @alias module:model/ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
     */
    constructor() { 
        
        ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties} The populated <code>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();

            if (data.hasOwnProperty('supportedPaths')) {
                obj['supportedPaths'] = ConfigNodePropertyArray.constructFromObject(data['supportedPaths']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} supportedPaths
 */
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.prototype['supportedPaths'] = undefined;






export default ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties;

