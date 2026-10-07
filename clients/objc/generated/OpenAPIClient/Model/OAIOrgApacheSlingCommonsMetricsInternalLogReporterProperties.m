#import "OAIOrgApacheSlingCommonsMetricsInternalLogReporterProperties.h"

@implementation OAIOrgApacheSlingCommonsMetricsInternalLogReporterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"period": @"period", @"timeUnit": @"timeUnit", @"level": @"level", @"loggerName": @"loggerName", @"prefix": @"prefix", @"pattern": @"pattern", @"registryName": @"registryName" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"period", @"timeUnit", @"level", @"loggerName", @"prefix", @"pattern", @"registryName"];
  return [optionalProperties containsObject:propertyName];
}

@end
