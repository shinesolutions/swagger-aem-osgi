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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties model module.
 * @module model/OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties} The populated <code>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties();

            if (data.hasOwnProperty('org.apache.jackrabbit.oak.authentication.appName')) {
                obj['org.apache.jackrabbit.oak.authentication.appName'] = ConfigNodePropertyString.constructFromObject(data['org.apache.jackrabbit.oak.authentication.appName']);
            }
            if (data.hasOwnProperty('org.apache.jackrabbit.oak.authentication.configSpiName')) {
                obj['org.apache.jackrabbit.oak.authentication.configSpiName'] = ConfigNodePropertyString.constructFromObject(data['org.apache.jackrabbit.oak.authentication.configSpiName']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} org.apache.jackrabbit.oak.authentication.appName
 */
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties.prototype['org.apache.jackrabbit.oak.authentication.appName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} org.apache.jackrabbit.oak.authentication.configSpiName
 */
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties.prototype['org.apache.jackrabbit.oak.authentication.configSpiName'] = undefined;






export default OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImplProperties;
