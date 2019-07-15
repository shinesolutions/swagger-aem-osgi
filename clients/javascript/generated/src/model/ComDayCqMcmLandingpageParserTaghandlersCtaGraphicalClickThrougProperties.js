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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties model module.
 * @module model/ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
 * @version 1.0.0
 */
class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties {
    /**
     * Constructs a new <code>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</code>.
     * @alias module:model/ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
     */
    constructor() { 
        
        ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties} The populated <code>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties();

            if (data.hasOwnProperty('service.ranking')) {
                obj['service.ranking'] = ConfigNodePropertyInteger.constructFromObject(data['service.ranking']);
            }
            if (data.hasOwnProperty('tagpattern')) {
                obj['tagpattern'] = ConfigNodePropertyString.constructFromObject(data['tagpattern']);
            }
            if (data.hasOwnProperty('component.resourceType')) {
                obj['component.resourceType'] = ConfigNodePropertyString.constructFromObject(data['component.resourceType']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.prototype['service.ranking'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} tagpattern
 */
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.prototype['tagpattern'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} component.resourceType
 */
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.prototype['component.resourceType'] = undefined;






export default ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties;

