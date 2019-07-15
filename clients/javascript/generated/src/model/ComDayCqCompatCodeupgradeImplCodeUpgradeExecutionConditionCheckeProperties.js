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

/**
 * The ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties model module.
 * @module model/ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
 * @version 1.0.0
 */
class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {
    /**
     * Constructs a new <code>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</code>.
     * @alias module:model/ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
     */
    constructor() { 
        
        ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties} The populated <code>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();

            if (data.hasOwnProperty('codeupgradetasks')) {
                obj['codeupgradetasks'] = ConfigNodePropertyArray.constructFromObject(data['codeupgradetasks']);
            }
            if (data.hasOwnProperty('codeupgradetaskfilters')) {
                obj['codeupgradetaskfilters'] = ConfigNodePropertyArray.constructFromObject(data['codeupgradetaskfilters']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} codeupgradetasks
 */
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.prototype['codeupgradetasks'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} codeupgradetaskfilters
 */
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.prototype['codeupgradetaskfilters'] = undefined;






export default ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties;

