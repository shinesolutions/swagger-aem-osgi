#import "OAIOrgApacheSlingEngineParametersProperties.h"

@implementation OAIOrgApacheSlingEngineParametersProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"slingDefaultParameterEncoding": @"sling.default.parameter.encoding", @"slingDefaultMaxParameters": @"sling.default.max.parameters", @"fileLocation": @"file.location", @"fileThreshold": @"file.threshold", @"fileMax": @"file.max", @"requestMax": @"request.max", @"slingDefaultParameterCheckForAdditionalContainerParameters": @"sling.default.parameter.checkForAdditionalContainerParameters" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"slingDefaultParameterEncoding", @"slingDefaultMaxParameters", @"fileLocation", @"fileThreshold", @"fileMax", @"requestMax", @"slingDefaultParameterCheckForAdditionalContainerParameters"];
  return [optionalProperties containsObject:propertyName];
}

@end
