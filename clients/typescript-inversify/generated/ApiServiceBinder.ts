import {interfaces} from 'inversify';

import { ConfigmgrService } from './api/configmgr.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<ConfigmgrService>('ConfigmgrService').to(ConfigmgrService).inSingletonScope();
    }
}
