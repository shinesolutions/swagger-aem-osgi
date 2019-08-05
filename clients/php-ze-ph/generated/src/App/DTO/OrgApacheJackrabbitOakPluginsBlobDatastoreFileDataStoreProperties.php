<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties
{
    /**
     * @DTA\Data(field="path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $path;
}
