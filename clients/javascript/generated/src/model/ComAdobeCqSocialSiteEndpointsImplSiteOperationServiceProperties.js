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
 * The ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties model module.
 * @module model/ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</code>.
     * @alias module:model/ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
     */
    constructor() { 
        
        ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties} The populated <code>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();

            if (data.hasOwnProperty('fieldWhitelist')) {
                obj['fieldWhitelist'] = ConfigNodePropertyArray.constructFromObject(data['fieldWhitelist']);
            }
            if (data.hasOwnProperty('sitePathFilters')) {
                obj['sitePathFilters'] = ConfigNodePropertyArray.constructFromObject(data['sitePathFilters']);
            }
            if (data.hasOwnProperty('sitePackageGroup')) {
                obj['sitePackageGroup'] = ConfigNodePropertyString.constructFromObject(data['sitePackageGroup']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} fieldWhitelist
 */
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.prototype['fieldWhitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} sitePathFilters
 */
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.prototype['sitePathFilters'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} sitePackageGroup
 */
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.prototype['sitePackageGroup'] = undefined;






export default ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties;

