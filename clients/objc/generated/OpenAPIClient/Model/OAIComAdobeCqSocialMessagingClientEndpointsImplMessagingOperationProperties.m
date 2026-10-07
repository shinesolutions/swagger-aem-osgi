#import "OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.h"

@implementation OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"messageProperties": @"message.properties", @"messageBoxSizeLimit": @"messageBoxSizeLimit", @"messageCountLimit": @"messageCountLimit", @"notifyFailure": @"notifyFailure", @"failureMessageFrom": @"failureMessageFrom", @"failureTemplatePath": @"failureTemplatePath", @"maxRetries": @"maxRetries", @"minWaitBetweenRetries": @"minWaitBetweenRetries", @"countUpdatePoolSize": @"countUpdatePoolSize", @"inboxPath": @"inbox.path", @"sentitemsPath": @"sentitems.path", @"supportAttachments": @"supportAttachments", @"supportGroupMessaging": @"supportGroupMessaging", @"maxTotalRecipients": @"maxTotalRecipients", @"batchSize": @"batchSize", @"maxTotalAttachmentSize": @"maxTotalAttachmentSize", @"attachmentTypeBlacklist": @"attachmentTypeBlacklist", @"allowedAttachmentTypes": @"allowedAttachmentTypes", @"serviceSelector": @"serviceSelector", @"fieldWhitelist": @"fieldWhitelist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"messageProperties", @"messageBoxSizeLimit", @"messageCountLimit", @"notifyFailure", @"failureMessageFrom", @"failureTemplatePath", @"maxRetries", @"minWaitBetweenRetries", @"countUpdatePoolSize", @"inboxPath", @"sentitemsPath", @"supportAttachments", @"supportGroupMessaging", @"maxTotalRecipients", @"batchSize", @"maxTotalAttachmentSize", @"attachmentTypeBlacklist", @"allowedAttachmentTypes", @"serviceSelector", @"fieldWhitelist"];
  return [optionalProperties containsObject:propertyName];
}

@end
