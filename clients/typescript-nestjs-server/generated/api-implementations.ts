import { Type } from '@nestjs/common';
import { ConfigmgrApi } from './api';

/**
 * Provide this type to {@link ApiModule} to provide your API implementations
**/
export type ApiImplementations = {
  configmgrApi: Type<ConfigmgrApi>
};
