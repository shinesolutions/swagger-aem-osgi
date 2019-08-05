#import "OAIComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.h"

@implementation OAIComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"filepattern": @"filepattern", @"deviceGroups": @"device.groups", @"buildPageNodes": @"build.page.nodes", @"buildClientLibs": @"build.client.libs", @"buildCanvasComponent": @"build.canvas.component" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"filepattern", @"deviceGroups", @"buildPageNodes", @"buildClientLibs", @"buildCanvasComponent"];
  return [optionalProperties containsObject:propertyName];
}

@end
