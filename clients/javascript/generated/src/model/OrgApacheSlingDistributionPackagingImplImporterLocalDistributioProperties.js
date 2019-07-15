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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties model module.
 * @module model/OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties} The populated <code>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('packageBuilder.target')) {
                obj['packageBuilder.target'] = ConfigNodePropertyString.constructFromObject(data['packageBuilder.target']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} packageBuilder.target
 */
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.prototype['packageBuilder.target'] = undefined;






export default OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties;

