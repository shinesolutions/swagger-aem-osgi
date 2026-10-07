#import "OAIComAdobeGraniteMonitoringImplScriptConfigImplProperties.h"

@implementation OAIComAdobeGraniteMonitoringImplScriptConfigImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"scriptFilename": @"script.filename", @"scriptDisplay": @"script.display", @"scriptPath": @"script.path", @"scriptPlatform": @"script.platform", @"interval": @"interval", @"jmxdomain": @"jmxdomain" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"scriptFilename", @"scriptDisplay", @"scriptPath", @"scriptPlatform", @"interval", @"jmxdomain"];
  return [optionalProperties containsObject:propertyName];
}

@end
