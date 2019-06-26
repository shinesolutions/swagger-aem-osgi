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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties model module.
 * @module model/ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</code>.
     * @alias module:model/ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
     */
    constructor() { 
        
        ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties} The populated <code>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();

            if (data.hasOwnProperty('path')) {
                obj['path'] = ConfigNodePropertyString.constructFromObject(data['path']);
            }
            if (data.hasOwnProperty('oauth.clientIds.allowed')) {
                obj['oauth.clientIds.allowed'] = ConfigNodePropertyArray.constructFromObject(data['oauth.clientIds.allowed']);
            }
            if (data.hasOwnProperty('auth.bearer.sync.ims')) {
                obj['auth.bearer.sync.ims'] = ConfigNodePropertyBoolean.constructFromObject(data['auth.bearer.sync.ims']);
            }
            if (data.hasOwnProperty('auth.tokenRequestParameter')) {
                obj['auth.tokenRequestParameter'] = ConfigNodePropertyString.constructFromObject(data['auth.tokenRequestParameter']);
            }
            if (data.hasOwnProperty('oauth.bearer.configid')) {
                obj['oauth.bearer.configid'] = ConfigNodePropertyString.constructFromObject(data['oauth.bearer.configid']);
            }
            if (data.hasOwnProperty('oauth.jwt.support')) {
                obj['oauth.jwt.support'] = ConfigNodePropertyBoolean.constructFromObject(data['oauth.jwt.support']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} path
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['path'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} oauth.clientIds.allowed
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['oauth.clientIds.allowed'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} auth.bearer.sync.ims
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['auth.bearer.sync.ims'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} auth.tokenRequestParameter
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['auth.tokenRequestParameter'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} oauth.bearer.configid
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['oauth.bearer.configid'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} oauth.jwt.support
 */
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.prototype['oauth.jwt.support'] = undefined;






export default ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties;
