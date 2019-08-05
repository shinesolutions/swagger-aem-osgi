#import "OAIOrgApacheSlingModelsImplModelAdapterFactoryProperties.h"

@implementation OAIOrgApacheSlingModelsImplModelAdapterFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"osgiHttpWhiteboardListener": @"osgi.http.whiteboard.listener", @"osgiHttpWhiteboardContextSelect": @"osgi.http.whiteboard.context.select", @"maxRecursionDepth": @"max.recursion.depth", @"cleanupJobPeriod": @"cleanup.job.period" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"osgiHttpWhiteboardListener", @"osgiHttpWhiteboardContextSelect", @"maxRecursionDepth", @"cleanupJobPeriod"];
  return [optionalProperties containsObject:propertyName];
}

@end
