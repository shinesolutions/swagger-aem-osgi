#import "OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h"

@implementation OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fromAddress": @"from.address", @"hostPrefix": @"host.prefix", @"notifyOnabort": @"notify.onabort", @"notifyOncomplete": @"notify.oncomplete", @"notifyOncontainercomplete": @"notify.oncontainercomplete", @"notifyUseronly": @"notify.useronly" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fromAddress", @"hostPrefix", @"notifyOnabort", @"notifyOncomplete", @"notifyOncontainercomplete", @"notifyUseronly"];
  return [optionalProperties containsObject:propertyName];
}

@end
