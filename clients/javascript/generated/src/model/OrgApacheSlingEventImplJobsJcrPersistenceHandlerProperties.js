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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties model module.
 * @module model/OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
 * @version 1.0.0
 */
class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
    /**
     * Constructs a new <code>OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</code>.
     * @alias module:model/OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
     */
    constructor() { 
        
        OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties} The populated <code>OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();

            if (data.hasOwnProperty('job.consumermanager.disableDistribution')) {
                obj['job.consumermanager.disableDistribution'] = ConfigNodePropertyBoolean.constructFromObject(data['job.consumermanager.disableDistribution']);
            }
            if (data.hasOwnProperty('startup.delay')) {
                obj['startup.delay'] = ConfigNodePropertyInteger.constructFromObject(data['startup.delay']);
            }
            if (data.hasOwnProperty('cleanup.period')) {
                obj['cleanup.period'] = ConfigNodePropertyInteger.constructFromObject(data['cleanup.period']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} job.consumermanager.disableDistribution
 */
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.prototype['job.consumermanager.disableDistribution'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} startup.delay
 */
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.prototype['startup.delay'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cleanup.period
 */
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.prototype['cleanup.period'] = undefined;






export default OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties;
