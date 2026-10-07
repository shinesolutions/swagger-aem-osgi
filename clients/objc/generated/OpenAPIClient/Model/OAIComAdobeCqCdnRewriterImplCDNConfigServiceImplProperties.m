#import "OAIComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.h"

@implementation OAIComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cdnConfigDistributionDomain": @"cdn.config.distribution.domain", @"cdnConfigEnableRewriting": @"cdn.config.enable.rewriting", @"cdnConfigPathPrefixes": @"cdn.config.path.prefixes", @"cdnConfigCdnttl": @"cdn.config.cdnttl", @"cdnConfigApplicationProtocol": @"cdn.config.application.protocol" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cdnConfigDistributionDomain", @"cdnConfigEnableRewriting", @"cdnConfigPathPrefixes", @"cdnConfigCdnttl", @"cdnConfigApplicationProtocol"];
  return [optionalProperties containsObject:propertyName];
}

@end
