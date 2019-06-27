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
 * The ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties model module.
 * @module model/ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</code>.
     * @alias module:model/ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
     */
    constructor() { 
        
        ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties} The populated <code>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();

            if (data.hasOwnProperty('everyoneLimit')) {
                obj['everyoneLimit'] = ConfigNodePropertyInteger.constructFromObject(data['everyoneLimit']);
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = ConfigNodePropertyInteger.constructFromObject(data['priority']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} everyoneLimit
 */
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.prototype['everyoneLimit'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} priority
 */
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.prototype['priority'] = undefined;






export default ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties;
