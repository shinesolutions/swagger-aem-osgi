<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
{
    /**
     * @DTA\Data(field="com.adobe.granite.httpcache.file.documentRoot", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_granite_httpcache_file_document_root = null;

    /**
     * @DTA\Data(field="com.adobe.granite.httpcache.file.includeHost", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_granite_httpcache_file_include_host = null;

}
