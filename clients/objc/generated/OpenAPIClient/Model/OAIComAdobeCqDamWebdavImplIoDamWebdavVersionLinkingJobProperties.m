#import "OAIComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.h"

@implementation OAIComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamWebdavVersionLinkingEnable": @"cq.dam.webdav.version.linking.enable", @"cqDamWebdavVersionLinkingSchedulerPeriod": @"cq.dam.webdav.version.linking.scheduler.period", @"cqDamWebdavVersionLinkingStagingTimeout": @"cq.dam.webdav.version.linking.staging.timeout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamWebdavVersionLinkingEnable", @"cqDamWebdavVersionLinkingSchedulerPeriod", @"cqDamWebdavVersionLinkingStagingTimeout"];
  return [optionalProperties containsObject:propertyName];
}

@end
