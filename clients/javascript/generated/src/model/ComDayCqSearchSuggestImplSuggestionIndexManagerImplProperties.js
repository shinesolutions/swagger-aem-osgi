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
 * The ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties model module.
 * @module model/ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
 * @version 1.0.0
 */
class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
    /**
     * Constructs a new <code>ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</code>.
     * @alias module:model/ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
     */
    constructor() { 
        
        ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties} The populated <code>ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();

            if (data.hasOwnProperty('pathBuilder.target')) {
                obj['pathBuilder.target'] = ConfigNodePropertyString.constructFromObject(data['pathBuilder.target']);
            }
            if (data.hasOwnProperty('suggest.basepath')) {
                obj['suggest.basepath'] = ConfigNodePropertyString.constructFromObject(data['suggest.basepath']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} pathBuilder.target
 */
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.prototype['pathBuilder.target'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} suggest.basepath
 */
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.prototype['suggest.basepath'] = undefined;






export default ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties;

