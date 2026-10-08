import { ConfigNodePropertyDropDownType } from './config-node-property-drop-down-type';


export interface ConfigNodePropertyDropDown { 
  /**
   * property name
   */
  name?: string;
  /**
   * True if optional
   */
  optional?: boolean;
  /**
   * True if property is set
   */
  is_set?: boolean;
  type?: ConfigNodePropertyDropDownType;
  /**
   * Property value
   */
  value?: any | null;
  /**
   * Property description
   */
  description?: string;
}

