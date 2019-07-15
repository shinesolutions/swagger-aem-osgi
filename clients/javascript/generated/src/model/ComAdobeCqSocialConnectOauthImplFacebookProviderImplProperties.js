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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties model module.
 * @module model/ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties} The populated <code>ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();

            if (data.hasOwnProperty('oauth.provider.id')) {
                obj['oauth.provider.id'] = ConfigNodePropertyString.constructFromObject(data['oauth.provider.id']);
            }
            if (data.hasOwnProperty('oauth.cloud.config.root')) {
                obj['oauth.cloud.config.root'] = ConfigNodePropertyString.constructFromObject(data['oauth.cloud.config.root']);
            }
            if (data.hasOwnProperty('provider.config.root')) {
                obj['provider.config.root'] = ConfigNodePropertyString.constructFromObject(data['provider.config.root']);
            }
            if (data.hasOwnProperty('provider.config.create.tags.enabled')) {
                obj['provider.config.create.tags.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['provider.config.create.tags.enabled']);
            }
            if (data.hasOwnProperty('provider.config.user.folder')) {
                obj['provider.config.user.folder'] = ConfigNodePropertyDropDown.constructFromObject(data['provider.config.user.folder']);
            }
            if (data.hasOwnProperty('provider.config.facebook.fetch.fields')) {
                obj['provider.config.facebook.fetch.fields'] = ConfigNodePropertyBoolean.constructFromObject(data['provider.config.facebook.fetch.fields']);
            }
            if (data.hasOwnProperty('provider.config.facebook.fields')) {
                obj['provider.config.facebook.fields'] = ConfigNodePropertyArray.constructFromObject(data['provider.config.facebook.fields']);
            }
            if (data.hasOwnProperty('provider.config.refresh.userdata.enabled')) {
                obj['provider.config.refresh.userdata.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['provider.config.refresh.userdata.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} oauth.provider.id
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['oauth.provider.id'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} oauth.cloud.config.root
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['oauth.cloud.config.root'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} provider.config.root
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.root'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} provider.config.create.tags.enabled
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.create.tags.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} provider.config.user.folder
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.user.folder'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} provider.config.facebook.fetch.fields
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.facebook.fetch.fields'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} provider.config.facebook.fields
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.facebook.fields'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} provider.config.refresh.userdata.enabled
 */
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.prototype['provider.config.refresh.userdata.enabled'] = undefined;






export default ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties;

