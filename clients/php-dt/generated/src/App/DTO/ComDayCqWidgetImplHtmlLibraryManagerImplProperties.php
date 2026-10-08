<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWidgetImplHtmlLibraryManagerImplProperties
{
    /**
     * @DTA\Data(field="htmllibmanager.clientmanager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $htmllibmanager_clientmanager = null;

    /**
     * @DTA\Data(field="htmllibmanager.debug", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_debug = null;

    /**
     * @DTA\Data(field="htmllibmanager.debug.console", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_debug_console = null;

    /**
     * @DTA\Data(field="htmllibmanager.debug.init.js", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $htmllibmanager_debug_init_js = null;

    /**
     * @DTA\Data(field="htmllibmanager.defaultthemename", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $htmllibmanager_defaultthemename = null;

    /**
     * @DTA\Data(field="htmllibmanager.defaultuserthemename", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $htmllibmanager_defaultuserthemename = null;

    /**
     * @DTA\Data(field="htmllibmanager.firebuglite.path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $htmllibmanager_firebuglite_path = null;

    /**
     * @DTA\Data(field="htmllibmanager.forceCQUrlInfo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_force_cq_url_info = null;

    /**
     * @DTA\Data(field="htmllibmanager.gzip", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_gzip = null;

    /**
     * @DTA\Data(field="htmllibmanager.maxage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $htmllibmanager_maxage = null;

    /**
     * @DTA\Data(field="htmllibmanager.maxDataUriSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $htmllibmanager_max_data_uri_size = null;

    /**
     * @DTA\Data(field="htmllibmanager.minify", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_minify = null;

    /**
     * @DTA\Data(field="htmllibmanager.path.list", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $htmllibmanager_path_list = null;

    /**
     * @DTA\Data(field="htmllibmanager.timing", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $htmllibmanager_timing = null;

}
