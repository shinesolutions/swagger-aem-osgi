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
 * The ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties model module.
 * @module model/ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
 * @version 1.0.0
 */
class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</code>.
     * @alias module:model/ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
     */
    constructor() { 
        
        ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties} The populated <code>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties();

            if (data.hasOwnProperty('auth.ims.client.secret')) {
                obj['auth.ims.client.secret'] = ConfigNodePropertyString.constructFromObject(data['auth.ims.client.secret']);
            }
            if (data.hasOwnProperty('customizer.type')) {
                obj['customizer.type'] = ConfigNodePropertyString.constructFromObject(data['customizer.type']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} auth.ims.client.secret
 */
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.prototype['auth.ims.client.secret'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} customizer.type
 */
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.prototype['customizer.type'] = undefined;






export default ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties;

