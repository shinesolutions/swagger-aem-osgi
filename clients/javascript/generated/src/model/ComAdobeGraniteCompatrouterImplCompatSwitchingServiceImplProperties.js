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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties model module.
 * @module model/ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
 * @version 1.0.0
 */
class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</code>.
     * @alias module:model/ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
     */
    constructor() { 
        
        ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties} The populated <code>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();

            if (data.hasOwnProperty('compatgroups')) {
                obj['compatgroups'] = ConfigNodePropertyArray.constructFromObject(data['compatgroups']);
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} compatgroups
 */
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.prototype['compatgroups'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.prototype['enabled'] = undefined;






export default ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties;

