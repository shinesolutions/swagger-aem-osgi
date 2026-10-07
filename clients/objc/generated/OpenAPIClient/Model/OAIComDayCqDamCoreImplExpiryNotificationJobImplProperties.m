#import "OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties.h"

@implementation OAIComDayCqDamCoreImplExpiryNotificationJobImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamExpiryNotificationSchedulerIstimebased": @"cq.dam.expiry.notification.scheduler.istimebased", @"cqDamExpiryNotificationSchedulerTimebasedRule": @"cq.dam.expiry.notification.scheduler.timebased.rule", @"cqDamExpiryNotificationSchedulerPeriodRule": @"cq.dam.expiry.notification.scheduler.period.rule", @"sendEmail": @"send_email", @"assetExpiredLimit": @"asset_expired_limit", @"priorNotificationSeconds": @"prior_notification_seconds", @"cqDamExpiryNotificationUrlProtocol": @"cq.dam.expiry.notification.url.protocol" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamExpiryNotificationSchedulerIstimebased", @"cqDamExpiryNotificationSchedulerTimebasedRule", @"cqDamExpiryNotificationSchedulerPeriodRule", @"sendEmail", @"assetExpiredLimit", @"priorNotificationSeconds", @"cqDamExpiryNotificationUrlProtocol"];
  return [optionalProperties containsObject:propertyName];
}

@end
