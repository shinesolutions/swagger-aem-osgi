#import "OAIComAdobeCqDeserfwImplDeserializationFirewallImplProperties.h"

@implementation OAIComAdobeCqDeserfwImplDeserializationFirewallImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"firewallDeserializationWhitelist": @"firewall.deserialization.whitelist", @"firewallDeserializationBlacklist": @"firewall.deserialization.blacklist", @"firewallDeserializationDiagnostics": @"firewall.deserialization.diagnostics" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"firewallDeserializationWhitelist", @"firewallDeserializationBlacklist", @"firewallDeserializationDiagnostics"];
  return [optionalProperties containsObject:propertyName];
}

@end
