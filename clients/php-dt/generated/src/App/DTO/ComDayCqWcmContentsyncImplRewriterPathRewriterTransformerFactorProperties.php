<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
{
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_contentsync_pathrewritertransformer_mapping_links = null;

    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.clientlibs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_contentsync_pathrewritertransformer_mapping_clientlibs = null;

    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_contentsync_pathrewritertransformer_mapping_images = null;

    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.attribute.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_contentsync_pathrewritertransformer_attribute_pattern = null;

    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.clientlibrary.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_contentsync_pathrewritertransformer_clientlibrary_pattern = null;

    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.clientlibrary.replace", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_contentsync_pathrewritertransformer_clientlibrary_replace = null;

}
