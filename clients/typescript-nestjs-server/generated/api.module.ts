import { DynamicModule, Module, Provider } from '@nestjs/common';
import { ApiImplementations } from './api-implementations'
import { ConfigmgrApi } from './api';
import { ConfigmgrApiController } from './controllers';

export type ApiModuleConfiguration = {
  /**
  * your Api implementations
  */
  apiImplementations: ApiImplementations,
  /**
  * additional Providers that may be used by your implementations
  */
  providers?: Provider[],
}

@Module({})
export class ApiModule {
  static forRoot(configuration: ApiModuleConfiguration): DynamicModule {
      const providers: Provider[] = [
        {
          provide: ConfigmgrApi,
          useClass: configuration.apiImplementations.configmgrApi
        },
        ...(configuration.providers || []),
      ];

      return {
        module: ApiModule,
        controllers: [
          ConfigmgrApiController,
        ],
        providers: [...providers],
        exports: [...providers]
      }
    }
}