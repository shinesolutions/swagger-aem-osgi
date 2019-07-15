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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties model module.
 * @module model/ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
 * @version 1.0.0
 */
class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
    /**
     * Constructs a new <code>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</code>.
     * @alias module:model/ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
     */
    constructor() { 
        
        ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties} The populated <code>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();

            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.mapping.links')) {
                obj['cq.contentsync.pathrewritertransformer.mapping.links'] = ConfigNodePropertyArray.constructFromObject(data['cq.contentsync.pathrewritertransformer.mapping.links']);
            }
            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.mapping.clientlibs')) {
                obj['cq.contentsync.pathrewritertransformer.mapping.clientlibs'] = ConfigNodePropertyArray.constructFromObject(data['cq.contentsync.pathrewritertransformer.mapping.clientlibs']);
            }
            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.mapping.images')) {
                obj['cq.contentsync.pathrewritertransformer.mapping.images'] = ConfigNodePropertyArray.constructFromObject(data['cq.contentsync.pathrewritertransformer.mapping.images']);
            }
            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.attribute.pattern')) {
                obj['cq.contentsync.pathrewritertransformer.attribute.pattern'] = ConfigNodePropertyString.constructFromObject(data['cq.contentsync.pathrewritertransformer.attribute.pattern']);
            }
            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.clientlibrary.pattern')) {
                obj['cq.contentsync.pathrewritertransformer.clientlibrary.pattern'] = ConfigNodePropertyString.constructFromObject(data['cq.contentsync.pathrewritertransformer.clientlibrary.pattern']);
            }
            if (data.hasOwnProperty('cq.contentsync.pathrewritertransformer.clientlibrary.replace')) {
                obj['cq.contentsync.pathrewritertransformer.clientlibrary.replace'] = ConfigNodePropertyString.constructFromObject(data['cq.contentsync.pathrewritertransformer.clientlibrary.replace']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} cq.contentsync.pathrewritertransformer.mapping.links
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.mapping.links'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cq.contentsync.pathrewritertransformer.mapping.clientlibs
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.mapping.clientlibs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cq.contentsync.pathrewritertransformer.mapping.images
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.mapping.images'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.contentsync.pathrewritertransformer.attribute.pattern
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.attribute.pattern'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.contentsync.pathrewritertransformer.clientlibrary.pattern
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.clientlibrary.pattern'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.contentsync.pathrewritertransformer.clientlibrary.replace
 */
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.prototype['cq.contentsync.pathrewritertransformer.clientlibrary.replace'] = undefined;






export default ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties;

