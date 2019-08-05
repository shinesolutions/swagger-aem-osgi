#import "OAIOrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h"

@implementation OAIOrgApacheSlingEngineImplLogRequestLoggerServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"requestLogServiceFormat": @"request.log.service.format", @"requestLogServiceOutput": @"request.log.service.output", @"requestLogServiceOutputtype": @"request.log.service.outputtype", @"requestLogServiceOnentry": @"request.log.service.onentry" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"requestLogServiceFormat", @"requestLogServiceOutput", @"requestLogServiceOutputtype", @"requestLogServiceOnentry"];
  return [optionalProperties containsObject:propertyName];
}

@end
