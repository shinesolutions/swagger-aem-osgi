#import "OAIComDayCqDamCoreImplServletResourceCollectionServletProperties.h"

@implementation OAIComDayCqDamCoreImplServletResourceCollectionServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"slingServletResourceTypes": @"sling.servlet.resourceTypes", @"slingServletMethods": @"sling.servlet.methods", @"slingServletSelectors": @"sling.servlet.selectors", @"downloadConfig": @"download.config", @"viewSelector": @"view.selector", @"sendEmail": @"send_email" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"slingServletResourceTypes", @"slingServletMethods", @"slingServletSelectors", @"downloadConfig", @"viewSelector", @"sendEmail"];
  return [optionalProperties containsObject:propertyName];
}

@end
