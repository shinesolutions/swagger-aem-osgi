<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.dam.mac.sync.client.so.timeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_dam_mac_sync_client_so_timeout = null;

}
