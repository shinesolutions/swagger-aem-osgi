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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties model module.
 * @module model/ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</code>.
     * @alias module:model/ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
     */
    constructor() { 
        
        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties} The populated <code>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();

            if (data.hasOwnProperty('enable')) {
                obj['enable'] = ConfigNodePropertyBoolean.constructFromObject(data['enable']);
            }
            if (data.hasOwnProperty('UGCLimit')) {
                obj['UGCLimit'] = ConfigNodePropertyInteger.constructFromObject(data['UGCLimit']);
            }
            if (data.hasOwnProperty('ugcLimitDuration')) {
                obj['ugcLimitDuration'] = ConfigNodePropertyInteger.constructFromObject(data['ugcLimitDuration']);
            }
            if (data.hasOwnProperty('domains')) {
                obj['domains'] = ConfigNodePropertyArray.constructFromObject(data['domains']);
            }
            if (data.hasOwnProperty('toList')) {
                obj['toList'] = ConfigNodePropertyArray.constructFromObject(data['toList']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable
 */
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.prototype['enable'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} UGCLimit
 */
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.prototype['UGCLimit'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} ugcLimitDuration
 */
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.prototype['ugcLimitDuration'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} domains
 */
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.prototype['domains'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} toList
 */
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.prototype['toList'] = undefined;






export default ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties;

