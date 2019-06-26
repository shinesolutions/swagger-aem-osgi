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

/**
 * The ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties model module.
 * @module model/ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties
 * @version 1.0.0
 */
class ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties {
    /**
     * Constructs a new <code>ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties</code>.
     * @alias module:model/ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties
     */
    constructor() { 
        
        ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties} The populated <code>ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties();

            if (data.hasOwnProperty('reportingservices.proxy.whitelist')) {
                obj['reportingservices.proxy.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['reportingservices.proxy.whitelist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} reportingservices.proxy.whitelist
 */
ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties.prototype['reportingservices.proxy.whitelist'] = undefined;






export default ComAdobeCqContentinsightImplServletsReportingServicesProxyServletProperties;

