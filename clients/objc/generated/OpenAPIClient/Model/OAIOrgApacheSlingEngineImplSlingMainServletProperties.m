#import "OAIOrgApacheSlingEngineImplSlingMainServletProperties.h"

@implementation OAIOrgApacheSlingEngineImplSlingMainServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"slingMaxCalls": @"sling.max.calls", @"slingMaxInclusions": @"sling.max.inclusions", @"slingTraceAllow": @"sling.trace.allow", @"slingMaxRecordRequests": @"sling.max.record.requests", @"slingStorePatternRequests": @"sling.store.pattern.requests", @"slingServerinfo": @"sling.serverinfo", @"slingAdditionalResponseHeaders": @"sling.additional.response.headers" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"slingMaxCalls", @"slingMaxInclusions", @"slingTraceAllow", @"slingMaxRecordRequests", @"slingStorePatternRequests", @"slingServerinfo", @"slingAdditionalResponseHeaders"];
  return [optionalProperties containsObject:propertyName];
}

@end
