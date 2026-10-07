#import "OAIOrgApacheSlingCommonsLogLogManagerProperties.h"

@implementation OAIOrgApacheSlingCommonsLogLogManagerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingCommonsLogLevel": @"org.apache.sling.commons.log.level", @"orgApacheSlingCommonsLogFile": @"org.apache.sling.commons.log.file", @"orgApacheSlingCommonsLogFileNumber": @"org.apache.sling.commons.log.file.number", @"orgApacheSlingCommonsLogFileSize": @"org.apache.sling.commons.log.file.size", @"orgApacheSlingCommonsLogPattern": @"org.apache.sling.commons.log.pattern", @"orgApacheSlingCommonsLogConfigurationFile": @"org.apache.sling.commons.log.configurationFile", @"orgApacheSlingCommonsLogPackagingDataEnabled": @"org.apache.sling.commons.log.packagingDataEnabled", @"orgApacheSlingCommonsLogMaxCallerDataDepth": @"org.apache.sling.commons.log.maxCallerDataDepth", @"orgApacheSlingCommonsLogMaxOldFileCountInDump": @"org.apache.sling.commons.log.maxOldFileCountInDump", @"orgApacheSlingCommonsLogNumOfLines": @"org.apache.sling.commons.log.numOfLines" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingCommonsLogLevel", @"orgApacheSlingCommonsLogFile", @"orgApacheSlingCommonsLogFileNumber", @"orgApacheSlingCommonsLogFileSize", @"orgApacheSlingCommonsLogPattern", @"orgApacheSlingCommonsLogConfigurationFile", @"orgApacheSlingCommonsLogPackagingDataEnabled", @"orgApacheSlingCommonsLogMaxCallerDataDepth", @"orgApacheSlingCommonsLogMaxOldFileCountInDump", @"orgApacheSlingCommonsLogNumOfLines"];
  return [optionalProperties containsObject:propertyName];
}

@end
