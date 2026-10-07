#import "OAIComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h"

@implementation OAIComDayCqDamCoreImplCacheCQBufferedImageCacheProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamImageCacheMaxMemory": @"cq.dam.image.cache.max.memory", @"cqDamImageCacheMaxAge": @"cq.dam.image.cache.max.age", @"cqDamImageCacheMaxDimension": @"cq.dam.image.cache.max.dimension" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamImageCacheMaxMemory", @"cqDamImageCacheMaxAge", @"cqDamImageCacheMaxDimension"];
  return [optionalProperties containsObject:propertyName];
}

@end
