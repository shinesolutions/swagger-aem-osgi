#import "OAIComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.h"

@implementation OAIComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"parameterWhitelist": @"parameter.whitelist", @"parameterWhitelistPrefixes": @"parameter.whitelist.prefixes", @"binaryParameterWhitelist": @"binary.parameter.whitelist", @"modifierWhitelist": @"modifier.whitelist", @"operationWhitelist": @"operation.whitelist", @"operationWhitelistPrefixes": @"operation.whitelist.prefixes", @"typehintWhitelist": @"typehint.whitelist", @"resourcetypeWhitelist": @"resourcetype.whitelist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"parameterWhitelist", @"parameterWhitelistPrefixes", @"binaryParameterWhitelist", @"modifierWhitelist", @"operationWhitelist", @"operationWhitelistPrefixes", @"typehintWhitelist", @"resourcetypeWhitelist"];
  return [optionalProperties containsObject:propertyName];
}

@end
