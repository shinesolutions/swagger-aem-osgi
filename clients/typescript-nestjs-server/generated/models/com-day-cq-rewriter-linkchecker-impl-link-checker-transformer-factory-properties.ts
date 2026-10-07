import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties { 
  'linkcheckertransformer.disableRewriting'?: ConfigNodePropertyBoolean;
  'linkcheckertransformer.disableChecking'?: ConfigNodePropertyBoolean;
  'linkcheckertransformer.mapCacheSize'?: ConfigNodePropertyInteger;
  'linkcheckertransformer.strictExtensionCheck'?: ConfigNodePropertyBoolean;
  'linkcheckertransformer.stripHtmltExtension'?: ConfigNodePropertyBoolean;
  'linkcheckertransformer.rewriteElements'?: ConfigNodePropertyArray;
  'linkcheckertransformer.stripExtensionPathBlacklist'?: ConfigNodePropertyArray;
}

