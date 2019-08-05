<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
{
    /**
     * @DTA\Data(field="osgi.http.whiteboard.servlet.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $osgi_http_whiteboard_servlet_pattern;
    /**
     * @DTA\Data(field="osgi.http.whiteboard.context.select", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $osgi_http_whiteboard_context_select;
}
