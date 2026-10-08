import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties { 
  'portal.outboxes'?: ConfigNodePropertyArray;
  'draft.data.service'?: ConfigNodePropertyString;
  'draft.metadata.service'?: ConfigNodePropertyString;
  'submit.data.service'?: ConfigNodePropertyString;
  'submit.metadata.service'?: ConfigNodePropertyString;
  'pendingSign.data.service'?: ConfigNodePropertyString;
  'pendingSign.metadata.service'?: ConfigNodePropertyString;
}

