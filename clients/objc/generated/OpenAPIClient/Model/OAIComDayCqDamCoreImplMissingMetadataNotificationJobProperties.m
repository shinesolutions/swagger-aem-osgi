#import "OAIComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h"

@implementation OAIComDayCqDamCoreImplMissingMetadataNotificationJobProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamMissingmetadataNotificationSchedulerIstimebased": @"cq.dam.missingmetadata.notification.scheduler.istimebased", @"cqDamMissingmetadataNotificationSchedulerTimebasedRule": @"cq.dam.missingmetadata.notification.scheduler.timebased.rule", @"cqDamMissingmetadataNotificationSchedulerPeriodRule": @"cq.dam.missingmetadata.notification.scheduler.period.rule", @"cqDamMissingmetadataNotificationRecipient": @"cq.dam.missingmetadata.notification.recipient" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamMissingmetadataNotificationSchedulerIstimebased", @"cqDamMissingmetadataNotificationSchedulerTimebasedRule", @"cqDamMissingmetadataNotificationSchedulerPeriodRule", @"cqDamMissingmetadataNotificationRecipient"];
  return [optionalProperties containsObject:propertyName];
}

@end
