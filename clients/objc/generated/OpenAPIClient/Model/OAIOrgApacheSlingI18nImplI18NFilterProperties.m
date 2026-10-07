#import "OAIOrgApacheSlingI18nImplI18NFilterProperties.h"

@implementation OAIOrgApacheSlingI18nImplI18NFilterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"serviceRanking": @"service.ranking", @"slingFilterScope": @"sling.filter.scope" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"serviceRanking", @"slingFilterScope"];
  return [optionalProperties containsObject:propertyName];
}

@end
