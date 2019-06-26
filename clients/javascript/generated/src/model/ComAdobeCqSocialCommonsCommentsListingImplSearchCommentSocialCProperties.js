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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties model module.
 * @module model/ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</code>.
     * @alias module:model/ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
     */
    constructor() { 
        
        ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties} The populated <code>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();

            if (data.hasOwnProperty('numUserLimit')) {
                obj['numUserLimit'] = ConfigNodePropertyInteger.constructFromObject(data['numUserLimit']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} numUserLimit
 */
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.prototype['numUserLimit'] = undefined;






export default ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties;

