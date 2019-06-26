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
 * The OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties model module.
 * @module model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties} The populated <code>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties();

            if (data.hasOwnProperty('cugSupportedPaths')) {
                obj['cugSupportedPaths'] = ConfigNodePropertyArray.constructFromObject(data['cugSupportedPaths']);
            }
            if (data.hasOwnProperty('cugEnabled')) {
                obj['cugEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['cugEnabled']);
            }
            if (data.hasOwnProperty('configurationRanking')) {
                obj['configurationRanking'] = ConfigNodePropertyInteger.constructFromObject(data['configurationRanking']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} cugSupportedPaths
 */
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.prototype['cugSupportedPaths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cugEnabled
 */
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.prototype['cugEnabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} configurationRanking
 */
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.prototype['configurationRanking'] = undefined;






export default OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties;

