#import "OAIOrgApacheSlingServletsGetDefaultGetServletProperties.h"

@implementation OAIOrgApacheSlingServletsGetDefaultGetServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aliases": @"aliases", @"index": @"index", @"indexFiles": @"index.files", @"enableHtml": @"enable.html", @"enableJson": @"enable.json", @"enableTxt": @"enable.txt", @"enableXml": @"enable.xml", @"jsonMaximumresults": @"json.maximumresults", @"ecmaSuport": @"ecmaSuport" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aliases", @"index", @"indexFiles", @"enableHtml", @"enableJson", @"enableTxt", @"enableXml", @"jsonMaximumresults", @"ecmaSuport"];
  return [optionalProperties containsObject:propertyName];
}

@end
