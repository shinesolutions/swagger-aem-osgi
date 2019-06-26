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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties model module.
 * @module model/OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties
 * @version 1.0.0
 */
class OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties</code>.
     * @alias module:model/OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties
     */
    constructor() { 
        
        OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties} The populated <code>OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('queue')) {
                obj['queue'] = ConfigNodePropertyString.constructFromObject(data['queue']);
            }
            if (data.hasOwnProperty('drop.invalid.items')) {
                obj['drop.invalid.items'] = ConfigNodePropertyBoolean.constructFromObject(data['drop.invalid.items']);
            }
            if (data.hasOwnProperty('agent.target')) {
                obj['agent.target'] = ConfigNodePropertyString.constructFromObject(data['agent.target']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} queue
 */
OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties.prototype['queue'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} drop.invalid.items
 */
OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties.prototype['drop.invalid.items'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} agent.target
 */
OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties.prototype['agent.target'] = undefined;






export default OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactoryProperties;
