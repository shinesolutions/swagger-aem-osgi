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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties model module.
 * @module model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</code>.
     * @alias module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
     */
    constructor() { 
        
        ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties} The populated <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();

            if (data.hasOwnProperty('resourceType.filters')) {
                obj['resourceType.filters'] = ConfigNodePropertyArray.constructFromObject(data['resourceType.filters']);
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = ConfigNodePropertyInteger.constructFromObject(data['priority']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} resourceType.filters
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.prototype['resourceType.filters'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} priority
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.prototype['priority'] = undefined;






export default ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties;
