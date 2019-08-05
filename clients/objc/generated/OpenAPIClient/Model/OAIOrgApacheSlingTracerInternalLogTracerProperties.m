#import "OAIOrgApacheSlingTracerInternalLogTracerProperties.h"

@implementation OAIOrgApacheSlingTracerInternalLogTracerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"tracerSets": @"tracerSets", @"enabled": @"enabled", @"servletEnabled": @"servletEnabled", @"recordingCacheSizeInMB": @"recordingCacheSizeInMB", @"recordingCacheDurationInSecs": @"recordingCacheDurationInSecs", @"recordingCompressionEnabled": @"recordingCompressionEnabled", @"gzipResponse": @"gzipResponse" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"tracerSets", @"enabled", @"servletEnabled", @"recordingCacheSizeInMB", @"recordingCacheDurationInSecs", @"recordingCompressionEnabled", @"gzipResponse"];
  return [optionalProperties containsObject:propertyName];
}

@end
