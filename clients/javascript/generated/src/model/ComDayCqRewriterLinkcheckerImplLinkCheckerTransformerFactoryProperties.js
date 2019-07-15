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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties model module.
 * @module model/ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
 * @version 1.0.0
 */
class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    /**
     * Constructs a new <code>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</code>.
     * @alias module:model/ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
     */
    constructor() { 
        
        ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties} The populated <code>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();

            if (data.hasOwnProperty('linkcheckertransformer.disableRewriting')) {
                obj['linkcheckertransformer.disableRewriting'] = ConfigNodePropertyBoolean.constructFromObject(data['linkcheckertransformer.disableRewriting']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.disableChecking')) {
                obj['linkcheckertransformer.disableChecking'] = ConfigNodePropertyBoolean.constructFromObject(data['linkcheckertransformer.disableChecking']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.mapCacheSize')) {
                obj['linkcheckertransformer.mapCacheSize'] = ConfigNodePropertyInteger.constructFromObject(data['linkcheckertransformer.mapCacheSize']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.strictExtensionCheck')) {
                obj['linkcheckertransformer.strictExtensionCheck'] = ConfigNodePropertyBoolean.constructFromObject(data['linkcheckertransformer.strictExtensionCheck']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.stripHtmltExtension')) {
                obj['linkcheckertransformer.stripHtmltExtension'] = ConfigNodePropertyBoolean.constructFromObject(data['linkcheckertransformer.stripHtmltExtension']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.rewriteElements')) {
                obj['linkcheckertransformer.rewriteElements'] = ConfigNodePropertyArray.constructFromObject(data['linkcheckertransformer.rewriteElements']);
            }
            if (data.hasOwnProperty('linkcheckertransformer.stripExtensionPathBlacklist')) {
                obj['linkcheckertransformer.stripExtensionPathBlacklist'] = ConfigNodePropertyArray.constructFromObject(data['linkcheckertransformer.stripExtensionPathBlacklist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} linkcheckertransformer.disableRewriting
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.disableRewriting'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} linkcheckertransformer.disableChecking
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.disableChecking'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} linkcheckertransformer.mapCacheSize
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.mapCacheSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} linkcheckertransformer.strictExtensionCheck
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.strictExtensionCheck'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} linkcheckertransformer.stripHtmltExtension
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.stripHtmltExtension'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} linkcheckertransformer.rewriteElements
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.rewriteElements'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} linkcheckertransformer.stripExtensionPathBlacklist
 */
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.prototype['linkcheckertransformer.stripExtensionPathBlacklist'] = undefined;






export default ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties;

