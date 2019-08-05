#import "OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h"

@implementation OAIOrgApacheSlingI18nImplJcrResourceBundleProviderProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"localeDefault": @"locale.default", @"preloadBundles": @"preload.bundles", @"invalidationDelay": @"invalidation.delay" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"localeDefault", @"preloadBundles", @"invalidationDelay"];
  return [optionalProperties containsObject:propertyName];
}

@end
