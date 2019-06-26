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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties model module.
 * @module model/ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
 * @version 1.0.0
 */
class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
    /**
     * Constructs a new <code>ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</code>.
     * @alias module:model/ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
     */
    constructor() { 
        
        ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties} The populated <code>ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();

            if (data.hasOwnProperty('cq.dam.scene7.damchangeeventlistener.enabled')) {
                obj['cq.dam.scene7.damchangeeventlistener.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['cq.dam.scene7.damchangeeventlistener.enabled']);
            }
            if (data.hasOwnProperty('cq.dam.scene7.damchangeeventlistener.observed.paths')) {
                obj['cq.dam.scene7.damchangeeventlistener.observed.paths'] = ConfigNodePropertyArray.constructFromObject(data['cq.dam.scene7.damchangeeventlistener.observed.paths']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} cq.dam.scene7.damchangeeventlistener.enabled
 */
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.prototype['cq.dam.scene7.damchangeeventlistener.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cq.dam.scene7.damchangeeventlistener.observed.paths
 */
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.prototype['cq.dam.scene7.damchangeeventlistener.observed.paths'] = undefined;






export default ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties;

