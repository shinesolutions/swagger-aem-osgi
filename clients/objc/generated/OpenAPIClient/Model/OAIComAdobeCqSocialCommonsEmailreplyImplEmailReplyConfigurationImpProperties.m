#import "OAIComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.h"

@implementation OAIComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"emailName": @"email.name", @"emailCreatePostFromReply": @"email.createPostFromReply", @"emailAddCommentIdTo": @"email.addCommentIdTo", @"emailSubjectMaximumLength": @"email.subjectMaximumLength", @"emailReplyToAddress": @"email.replyToAddress", @"emailReplyToDelimiter": @"email.replyToDelimiter", @"emailTrackerIdPrefixInSubject": @"email.trackerIdPrefixInSubject", @"emailTrackerIdPrefixInBody": @"email.trackerIdPrefixInBody", @"emailAsHTML": @"email.asHTML", @"emailDefaultUserName": @"email.defaultUserName", @"emailTemplatesRootPath": @"email.templates.rootPath" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"emailName", @"emailCreatePostFromReply", @"emailAddCommentIdTo", @"emailSubjectMaximumLength", @"emailReplyToAddress", @"emailReplyToDelimiter", @"emailTrackerIdPrefixInSubject", @"emailTrackerIdPrefixInBody", @"emailAsHTML", @"emailDefaultUserName", @"emailTemplatesRootPath"];
  return [optionalProperties containsObject:propertyName];
}

@end
