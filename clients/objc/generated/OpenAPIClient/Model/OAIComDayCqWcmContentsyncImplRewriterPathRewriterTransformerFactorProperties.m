#import "OAIComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h"

@implementation OAIComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqContentsyncPathrewritertransformerMappingLinks": @"cq.contentsync.pathrewritertransformer.mapping.links", @"cqContentsyncPathrewritertransformerMappingClientlibs": @"cq.contentsync.pathrewritertransformer.mapping.clientlibs", @"cqContentsyncPathrewritertransformerMappingImages": @"cq.contentsync.pathrewritertransformer.mapping.images", @"cqContentsyncPathrewritertransformerAttributePattern": @"cq.contentsync.pathrewritertransformer.attribute.pattern", @"cqContentsyncPathrewritertransformerClientlibraryPattern": @"cq.contentsync.pathrewritertransformer.clientlibrary.pattern", @"cqContentsyncPathrewritertransformerClientlibraryReplace": @"cq.contentsync.pathrewritertransformer.clientlibrary.replace" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqContentsyncPathrewritertransformerMappingLinks", @"cqContentsyncPathrewritertransformerMappingClientlibs", @"cqContentsyncPathrewritertransformerMappingImages", @"cqContentsyncPathrewritertransformerAttributePattern", @"cqContentsyncPathrewritertransformerClientlibraryPattern", @"cqContentsyncPathrewritertransformerClientlibraryReplace"];
  return [optionalProperties containsObject:propertyName];
}

@end
