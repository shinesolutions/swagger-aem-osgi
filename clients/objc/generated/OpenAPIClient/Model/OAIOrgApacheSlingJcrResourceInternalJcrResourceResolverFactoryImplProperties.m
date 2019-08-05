#import "OAIOrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h"

@implementation OAIOrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"resourceResolverSearchpath": @"resource.resolver.searchpath", @"resourceResolverManglenamespaces": @"resource.resolver.manglenamespaces", @"resourceResolverAllowDirect": @"resource.resolver.allowDirect", @"resourceResolverRequiredProviders": @"resource.resolver.required.providers", @"resourceResolverRequiredProvidernames": @"resource.resolver.required.providernames", @"resourceResolverVirtual": @"resource.resolver.virtual", @"resourceResolverMapping": @"resource.resolver.mapping", @"resourceResolverMapLocation": @"resource.resolver.map.location", @"resourceResolverMapObservation": @"resource.resolver.map.observation", @"resourceResolverDefaultVanityRedirectStatus": @"resource.resolver.default.vanity.redirect.status", @"resourceResolverEnableVanitypath": @"resource.resolver.enable.vanitypath", @"resourceResolverVanitypathMaxEntries": @"resource.resolver.vanitypath.maxEntries", @"resourceResolverVanitypathMaxEntriesStartup": @"resource.resolver.vanitypath.maxEntries.startup", @"resourceResolverVanitypathBloomfilterMaxBytes": @"resource.resolver.vanitypath.bloomfilter.maxBytes", @"resourceResolverOptimizeAliasResolution": @"resource.resolver.optimize.alias.resolution", @"resourceResolverVanitypathWhitelist": @"resource.resolver.vanitypath.whitelist", @"resourceResolverVanitypathBlacklist": @"resource.resolver.vanitypath.blacklist", @"resourceResolverVanityPrecedence": @"resource.resolver.vanity.precedence", @"resourceResolverProviderhandlingParanoid": @"resource.resolver.providerhandling.paranoid", @"resourceResolverLogClosing": @"resource.resolver.log.closing", @"resourceResolverLogUnclosed": @"resource.resolver.log.unclosed" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"resourceResolverSearchpath", @"resourceResolverManglenamespaces", @"resourceResolverAllowDirect", @"resourceResolverRequiredProviders", @"resourceResolverRequiredProvidernames", @"resourceResolverVirtual", @"resourceResolverMapping", @"resourceResolverMapLocation", @"resourceResolverMapObservation", @"resourceResolverDefaultVanityRedirectStatus", @"resourceResolverEnableVanitypath", @"resourceResolverVanitypathMaxEntries", @"resourceResolverVanitypathMaxEntriesStartup", @"resourceResolverVanitypathBloomfilterMaxBytes", @"resourceResolverOptimizeAliasResolution", @"resourceResolverVanitypathWhitelist", @"resourceResolverVanitypathBlacklist", @"resourceResolverVanityPrecedence", @"resourceResolverProviderhandlingParanoid", @"resourceResolverLogClosing", @"resourceResolverLogUnclosed"];
  return [optionalProperties containsObject:propertyName];
}

@end
