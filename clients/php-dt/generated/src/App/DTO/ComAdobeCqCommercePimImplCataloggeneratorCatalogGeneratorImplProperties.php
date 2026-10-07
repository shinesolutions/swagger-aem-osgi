<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
{
    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.bucketsize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_commerce_cataloggenerator_bucketsize = null;

    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.bucketname", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_commerce_cataloggenerator_bucketname = null;

    /**
     * @DTA\Data(field="cq.commerce.cataloggenerator.excludedtemplateproperties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_commerce_cataloggenerator_excludedtemplateproperties = null;

}
