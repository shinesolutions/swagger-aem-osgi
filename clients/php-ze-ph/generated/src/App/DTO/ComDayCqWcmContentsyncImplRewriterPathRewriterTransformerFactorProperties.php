<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
{
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_contentsync_pathrewritertransformer_mapping_links;
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.clientlibs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_contentsync_pathrewritertransformer_mapping_clientlibs;
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.mapping.images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_contentsync_pathrewritertransformer_mapping_images;
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.attribute.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_contentsync_pathrewritertransformer_attribute_pattern;
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.clientlibrary.pattern", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_contentsync_pathrewritertransformer_clientlibrary_pattern;
    /**
     * @DTA\Data(field="cq.contentsync.pathrewritertransformer.clientlibrary.replace", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_contentsync_pathrewritertransformer_clientlibrary_replace;
}
