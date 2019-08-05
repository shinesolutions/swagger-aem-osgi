#import "OAIOrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.h"

@implementation OAIOrgApacheFelixSystemreadyImplServletSystemAliveServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"osgiHttpWhiteboardServletPattern": @"osgi.http.whiteboard.servlet.pattern", @"osgiHttpWhiteboardContextSelect": @"osgi.http.whiteboard.context.select" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"osgiHttpWhiteboardServletPattern", @"osgiHttpWhiteboardContextSelect"];
  return [optionalProperties containsObject:propertyName];
}

@end
