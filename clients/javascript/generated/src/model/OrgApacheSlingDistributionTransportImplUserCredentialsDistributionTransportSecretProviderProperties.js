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
 * The OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties model module.
 * @module model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties} The populated <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('username')) {
                obj['username'] = ConfigNodePropertyString.constructFromObject(data['username']);
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ConfigNodePropertyString.constructFromObject(data['password']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} username
 */
OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties.prototype['username'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} password
 */
OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties.prototype['password'] = undefined;






export default OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProviderProperties;

