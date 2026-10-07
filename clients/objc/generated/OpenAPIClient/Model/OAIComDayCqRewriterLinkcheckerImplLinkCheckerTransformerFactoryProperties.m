#import "OAIComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h"

@implementation OAIComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"linkcheckertransformerDisableRewriting": @"linkcheckertransformer.disableRewriting", @"linkcheckertransformerDisableChecking": @"linkcheckertransformer.disableChecking", @"linkcheckertransformerMapCacheSize": @"linkcheckertransformer.mapCacheSize", @"linkcheckertransformerStrictExtensionCheck": @"linkcheckertransformer.strictExtensionCheck", @"linkcheckertransformerStripHtmltExtension": @"linkcheckertransformer.stripHtmltExtension", @"linkcheckertransformerRewriteElements": @"linkcheckertransformer.rewriteElements", @"linkcheckertransformerStripExtensionPathBlacklist": @"linkcheckertransformer.stripExtensionPathBlacklist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"linkcheckertransformerDisableRewriting", @"linkcheckertransformerDisableChecking", @"linkcheckertransformerMapCacheSize", @"linkcheckertransformerStrictExtensionCheck", @"linkcheckertransformerStripHtmltExtension", @"linkcheckertransformerRewriteElements", @"linkcheckertransformerStripExtensionPathBlacklist"];
  return [optionalProperties containsObject:propertyName];
}

@end
