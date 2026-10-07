#import "OAIComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.h"

@implementation OAIComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"maxConnections": @"maxConnections", @"maxRequests": @"maxRequests", @"requestTimeout": @"requestTimeout", @"logDir": @"logDir" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"maxConnections", @"maxRequests", @"requestTimeout", @"logDir"];
  return [optionalProperties containsObject:propertyName];
}

@end
