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
 * The ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties model module.
 * @module model/ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties</code>.
     * @alias module:model/ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties
     */
    constructor() { 
        
        ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties} The populated <code>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties();

            if (data.hasOwnProperty('job.topics')) {
                obj['job.topics'] = ConfigNodePropertyString.constructFromObject(data['job.topics']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} job.topics
 */
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties.prototype['job.topics'] = undefined;






export default ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumerProperties;

