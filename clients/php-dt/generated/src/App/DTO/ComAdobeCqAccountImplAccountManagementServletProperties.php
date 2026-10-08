<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqAccountImplAccountManagementServletProperties
{
    /**
     * @DTA\Data(field="cq.accountmanager.config.informnewaccount.mail", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_accountmanager_config_informnewaccount_mail = null;

    /**
     * @DTA\Data(field="cq.accountmanager.config.informnewpwd.mail", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_accountmanager_config_informnewpwd_mail = null;

}
