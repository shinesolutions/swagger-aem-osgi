#import "OAIComDayCqSearchImplBuilderQueryBuilderImplProperties.h"

@implementation OAIComDayCqSearchImplBuilderQueryBuilderImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"excerptProperties": @"excerpt.properties", @"cacheMaxEntries": @"cache.max.entries", @"cacheEntryLifetime": @"cache.entry.lifetime", @"xpathUnion": @"xpath.union" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"excerptProperties", @"cacheMaxEntries", @"cacheEntryLifetime", @"xpathUnion"];
  return [optionalProperties containsObject:propertyName];
}

@end
