import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties { 
  'mailer.email.embed'?: ConfigNodePropertyBoolean;
  'mailer.email.charset'?: ConfigNodePropertyString;
  'mailer.email.retrieverUserID'?: ConfigNodePropertyString;
  'mailer.email.retrieverUserPWD'?: ConfigNodePropertyString;
}

