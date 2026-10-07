#import "OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h"

@implementation OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"totalWidth": @"totalWidth", @"colWidthName": @"colWidthName", @"colWidthResult": @"colWidthResult", @"colWidthTiming": @"colWidthTiming" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"totalWidth", @"colWidthName", @"colWidthResult", @"colWidthTiming"];
  return [optionalProperties containsObject:propertyName];
}

@end
