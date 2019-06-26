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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties model module.
 * @module model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties} The populated <code>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();

            if (data.hasOwnProperty('permissionsJr2')) {
                obj['permissionsJr2'] = ConfigNodePropertyDropDown.constructFromObject(data['permissionsJr2']);
            }
            if (data.hasOwnProperty('importBehavior')) {
                obj['importBehavior'] = ConfigNodePropertyDropDown.constructFromObject(data['importBehavior']);
            }
            if (data.hasOwnProperty('readPaths')) {
                obj['readPaths'] = ConfigNodePropertyArray.constructFromObject(data['readPaths']);
            }
            if (data.hasOwnProperty('administrativePrincipals')) {
                obj['administrativePrincipals'] = ConfigNodePropertyArray.constructFromObject(data['administrativePrincipals']);
            }
            if (data.hasOwnProperty('configurationRanking')) {
                obj['configurationRanking'] = ConfigNodePropertyInteger.constructFromObject(data['configurationRanking']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyDropDown} permissionsJr2
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.prototype['permissionsJr2'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} importBehavior
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.prototype['importBehavior'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} readPaths
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.prototype['readPaths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} administrativePrincipals
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.prototype['administrativePrincipals'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} configurationRanking
 */
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.prototype['configurationRanking'] = undefined;






export default OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties;

