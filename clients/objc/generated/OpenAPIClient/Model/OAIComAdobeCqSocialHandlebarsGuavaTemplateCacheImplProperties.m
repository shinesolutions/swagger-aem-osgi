#import "OAIComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.h"

@implementation OAIComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"parameterGuavaCacheEnabled": @"parameter.guava.cache.enabled", @"parameterGuavaCacheParams": @"parameter.guava.cache.params", @"parameterGuavaCacheReload": @"parameter.guava.cache.reload", @"serviceRanking": @"service.ranking" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"parameterGuavaCacheEnabled", @"parameterGuavaCacheParams", @"parameterGuavaCacheReload", @"serviceRanking"];
  return [optionalProperties containsObject:propertyName];
}

@end
