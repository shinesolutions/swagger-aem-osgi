import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties { 
  'email.name'?: ConfigNodePropertyString;
  'email.createPostFromReply'?: ConfigNodePropertyBoolean;
  'email.addCommentIdTo'?: ConfigNodePropertyDropDown;
  'email.subjectMaximumLength'?: ConfigNodePropertyInteger;
  'email.replyToAddress'?: ConfigNodePropertyString;
  'email.replyToDelimiter'?: ConfigNodePropertyString;
  'email.trackerIdPrefixInSubject'?: ConfigNodePropertyString;
  'email.trackerIdPrefixInBody'?: ConfigNodePropertyString;
  'email.asHTML'?: ConfigNodePropertyBoolean;
  'email.defaultUserName'?: ConfigNodePropertyString;
  'email.templates.rootPath'?: ConfigNodePropertyString;
}

