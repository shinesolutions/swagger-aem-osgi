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
 * The OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties model module.
 * @module model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties} The populated <code>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();

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
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} username
 */
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.prototype['username'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} password
 */
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.prototype['password'] = undefined;






export default OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties;

