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

/**
 * The ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties model module.
 * @module model/ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
 * @version 1.0.0
 */
class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</code>.
     * @alias module:model/ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
     */
    constructor() { 
        
        ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties} The populated <code>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();

            if (data.hasOwnProperty('granite.workflow.WorkflowPublishEventService.enabled')) {
                obj['granite.workflow.WorkflowPublishEventService.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['granite.workflow.WorkflowPublishEventService.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} granite.workflow.WorkflowPublishEventService.enabled
 */
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.prototype['granite.workflow.WorkflowPublishEventService.enabled'] = undefined;






export default ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties;

