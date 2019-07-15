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

/**
 * The OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties model module.
 * @module model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties} The populated <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties();

            if (data.hasOwnProperty('principalNames')) {
                obj['principalNames'] = ConfigNodePropertyArray.constructFromObject(data['principalNames']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} principalNames
 */
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.prototype['principalNames'] = undefined;






export default OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties;

