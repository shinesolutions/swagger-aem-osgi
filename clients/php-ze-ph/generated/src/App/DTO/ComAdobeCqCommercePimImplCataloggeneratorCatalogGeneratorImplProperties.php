<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
{
    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.bucketsize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_commerce_cataloggenerator_bucketsize;
    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.bucketname", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_commerce_cataloggenerator_bucketname;
    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.excludedtemplateproperties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_commerce_cataloggenerator_excludedtemplateproperties;
}
