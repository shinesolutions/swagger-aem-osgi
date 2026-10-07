#import "OAIComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.h"

@implementation OAIComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"damShowexpired": @"dam.showexpired", @"damShowhidden": @"dam.showhidden", @"tagTitleSearch": @"tagTitleSearch", @"guessTotal": @"guessTotal", @"damExpiryProperty": @"dam.expiryProperty" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"damShowexpired", @"damShowhidden", @"tagTitleSearch", @"guessTotal", @"damExpiryProperty"];
  return [optionalProperties containsObject:propertyName];
}

@end
