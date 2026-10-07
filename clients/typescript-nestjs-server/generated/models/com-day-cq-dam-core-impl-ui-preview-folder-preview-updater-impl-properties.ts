import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties { 
  createPreviewEnabled?: ConfigNodePropertyBoolean;
  updatePreviewEnabled?: ConfigNodePropertyBoolean;
  queueSize?: ConfigNodePropertyInteger;
  folderPreviewRenditionRegex?: ConfigNodePropertyString;
}

