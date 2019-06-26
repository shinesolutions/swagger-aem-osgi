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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties model module.
 * @module model/ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</code>.
     * @alias module:model/ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
     */
    constructor() { 
        
        ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties} The populated <code>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();

            if (data.hasOwnProperty('facebook')) {
                obj['facebook'] = ConfigNodePropertyArray.constructFromObject(data['facebook']);
            }
            if (data.hasOwnProperty('twitter')) {
                obj['twitter'] = ConfigNodePropertyArray.constructFromObject(data['twitter']);
            }
            if (data.hasOwnProperty('provider.config.user.folder')) {
                obj['provider.config.user.folder'] = ConfigNodePropertyString.constructFromObject(data['provider.config.user.folder']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} facebook
 */
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.prototype['facebook'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} twitter
 */
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.prototype['twitter'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} provider.config.user.folder
 */
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.prototype['provider.config.user.folder'] = undefined;






export default ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties;
