

export interface ConfigNodePropertyString { 
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
  /**
   * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
   */
  type?: number;
  /**
   * Property value
   */
  value?: string;
  /**
   * Property description
   */
  description?: string;
}

