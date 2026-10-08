<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqAccountApiAccountManagementServiceProperties
{
    /**
     * @DTA\Data(field="cq.accountmanager.token.validity.period", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger|null
     */
    public $cq_accountmanager_token_validity_period;

    /**
     * @DTA\Data(field="cq.accountmanager.config.requestnewaccount.mail", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString|null
     */
    public $cq_accountmanager_config_requestnewaccount_mail;

    /**
     * @DTA\Data(field="cq.accountmanager.config.requestnewpwd.mail", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString|null
     */
    public $cq_accountmanager_config_requestnewpwd_mail;

}
