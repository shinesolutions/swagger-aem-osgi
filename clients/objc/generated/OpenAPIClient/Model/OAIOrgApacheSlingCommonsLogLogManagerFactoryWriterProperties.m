#import "OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h"

@implementation OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingCommonsLogFile": @"org.apache.sling.commons.log.file", @"orgApacheSlingCommonsLogFileNumber": @"org.apache.sling.commons.log.file.number", @"orgApacheSlingCommonsLogFileSize": @"org.apache.sling.commons.log.file.size", @"orgApacheSlingCommonsLogFileBuffered": @"org.apache.sling.commons.log.file.buffered" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingCommonsLogFile", @"orgApacheSlingCommonsLogFileNumber", @"orgApacheSlingCommonsLogFileSize", @"orgApacheSlingCommonsLogFileBuffered"];
  return [optionalProperties containsObject:propertyName];
}

@end
