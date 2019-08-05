#import "OAIOrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h"

@implementation OAIOrgApacheSlingCommonsLogLogManagerFactoryConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingCommonsLogLevel": @"org.apache.sling.commons.log.level", @"orgApacheSlingCommonsLogFile": @"org.apache.sling.commons.log.file", @"orgApacheSlingCommonsLogPattern": @"org.apache.sling.commons.log.pattern", @"orgApacheSlingCommonsLogNames": @"org.apache.sling.commons.log.names", @"orgApacheSlingCommonsLogAdditiv": @"org.apache.sling.commons.log.additiv" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingCommonsLogLevel", @"orgApacheSlingCommonsLogFile", @"orgApacheSlingCommonsLogPattern", @"orgApacheSlingCommonsLogNames", @"orgApacheSlingCommonsLogAdditiv"];
  return [optionalProperties containsObject:propertyName];
}

@end
