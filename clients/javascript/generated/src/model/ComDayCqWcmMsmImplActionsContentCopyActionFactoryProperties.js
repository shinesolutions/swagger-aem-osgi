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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';

/**
 * The ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties model module.
 * @module model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
 * @version 1.0.0
 */
class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {
    /**
     * Constructs a new <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</code>.
     * @alias module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
     */
    constructor() { 
        
        ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties} The populated <code>ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties();

            if (data.hasOwnProperty('cq.wcm.msm.action.excludednodetypes')) {
                obj['cq.wcm.msm.action.excludednodetypes'] = ConfigNodePropertyArray.constructFromObject(data['cq.wcm.msm.action.excludednodetypes']);
            }
            if (data.hasOwnProperty('cq.wcm.msm.action.excludedparagraphitems')) {
                obj['cq.wcm.msm.action.excludedparagraphitems'] = ConfigNodePropertyArray.constructFromObject(data['cq.wcm.msm.action.excludedparagraphitems']);
            }
            if (data.hasOwnProperty('cq.wcm.msm.action.excludedprops')) {
                obj['cq.wcm.msm.action.excludedprops'] = ConfigNodePropertyArray.constructFromObject(data['cq.wcm.msm.action.excludedprops']);
            }
            if (data.hasOwnProperty('contentcopyaction.order.style')) {
                obj['contentcopyaction.order.style'] = ConfigNodePropertyDropDown.constructFromObject(data['contentcopyaction.order.style']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} cq.wcm.msm.action.excludednodetypes
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.prototype['cq.wcm.msm.action.excludednodetypes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cq.wcm.msm.action.excludedparagraphitems
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.prototype['cq.wcm.msm.action.excludedparagraphitems'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cq.wcm.msm.action.excludedprops
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.prototype['cq.wcm.msm.action.excludedprops'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} contentcopyaction.order.style
 */
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.prototype['contentcopyaction.order.style'] = undefined;






export default ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties;

