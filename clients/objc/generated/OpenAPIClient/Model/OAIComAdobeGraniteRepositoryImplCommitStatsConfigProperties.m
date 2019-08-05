#import "OAIComAdobeGraniteRepositoryImplCommitStatsConfigProperties.h"

@implementation OAIComAdobeGraniteRepositoryImplCommitStatsConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"enabled": @"enabled", @"intervalSeconds": @"intervalSeconds", @"commitsPerIntervalThreshold": @"commitsPerIntervalThreshold", @"maxLocationLength": @"maxLocationLength", @"maxDetailsShown": @"maxDetailsShown", @"minDetailsPercentage": @"minDetailsPercentage", @"threadMatchers": @"threadMatchers", @"maxGreedyDepth": @"maxGreedyDepth", @"greedyStackMatchers": @"greedyStackMatchers", @"stackFilters": @"stackFilters", @"stackMatchers": @"stackMatchers", @"stackCategorizers": @"stackCategorizers", @"stackShorteners": @"stackShorteners" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"enabled", @"intervalSeconds", @"commitsPerIntervalThreshold", @"maxLocationLength", @"maxDetailsShown", @"minDetailsPercentage", @"threadMatchers", @"maxGreedyDepth", @"greedyStackMatchers", @"stackFilters", @"stackMatchers", @"stackCategorizers", @"stackShorteners"];
  return [optionalProperties containsObject:propertyName];
}

@end
