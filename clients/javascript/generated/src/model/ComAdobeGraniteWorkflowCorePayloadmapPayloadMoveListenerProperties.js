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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties model module.
 * @module model/ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</code>.
     * @alias module:model/ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
     */
    constructor() { 
        
        ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties} The populated <code>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();

            if (data.hasOwnProperty('payload.move.white.list')) {
                obj['payload.move.white.list'] = ConfigNodePropertyArray.constructFromObject(data['payload.move.white.list']);
            }
            if (data.hasOwnProperty('payload.move.handle.from.workflow.process')) {
                obj['payload.move.handle.from.workflow.process'] = ConfigNodePropertyBoolean.constructFromObject(data['payload.move.handle.from.workflow.process']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} payload.move.white.list
 */
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.prototype['payload.move.white.list'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} payload.move.handle.from.workflow.process
 */
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.prototype['payload.move.handle.from.workflow.process'] = undefined;






export default ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties;

