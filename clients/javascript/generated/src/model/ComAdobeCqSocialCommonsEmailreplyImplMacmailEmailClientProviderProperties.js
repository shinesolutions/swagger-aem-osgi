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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties model module.
 * @module model/ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties</code>.
     * @alias module:model/ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
     */
    constructor() { 
        
        ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties} The populated <code>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties();

            if (data.hasOwnProperty('priorityOrder')) {
                obj['priorityOrder'] = ConfigNodePropertyInteger.constructFromObject(data['priorityOrder']);
            }
            if (data.hasOwnProperty('replyEmailPatterns')) {
                obj['replyEmailPatterns'] = ConfigNodePropertyArray.constructFromObject(data['replyEmailPatterns']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} priorityOrder
 */
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.prototype['priorityOrder'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} replyEmailPatterns
 */
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.prototype['replyEmailPatterns'] = undefined;






export default ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties;

