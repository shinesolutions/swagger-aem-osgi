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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties model module.
 * @module model/ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</code>.
     * @alias module:model/ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
     */
    constructor() { 
        
        ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties} The populated <code>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();

            if (data.hasOwnProperty('oauth.token.revocation.active')) {
                obj['oauth.token.revocation.active'] = ConfigNodePropertyBoolean.constructFromObject(data['oauth.token.revocation.active']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} oauth.token.revocation.active
 */
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.prototype['oauth.token.revocation.active'] = undefined;






export default ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties;

