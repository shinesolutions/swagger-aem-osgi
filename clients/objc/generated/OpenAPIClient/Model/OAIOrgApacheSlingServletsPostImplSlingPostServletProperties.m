#import "OAIOrgApacheSlingServletsPostImplSlingPostServletProperties.h"

@implementation OAIOrgApacheSlingServletsPostImplSlingPostServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"servletPostDateFormats": @"servlet.post.dateFormats", @"servletPostNodeNameHints": @"servlet.post.nodeNameHints", @"servletPostNodeNameMaxLength": @"servlet.post.nodeNameMaxLength", @"servletPostCheckinNewVersionableNodes": @"servlet.post.checkinNewVersionableNodes", @"servletPostAutoCheckout": @"servlet.post.autoCheckout", @"servletPostAutoCheckin": @"servlet.post.autoCheckin", @"servletPostIgnorePattern": @"servlet.post.ignorePattern" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"servletPostDateFormats", @"servletPostNodeNameHints", @"servletPostNodeNameMaxLength", @"servletPostCheckinNewVersionableNodes", @"servletPostAutoCheckout", @"servletPostAutoCheckin", @"servletPostIgnorePattern"];
  return [optionalProperties containsObject:propertyName];
}

@end
