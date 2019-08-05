<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comDayCqDamCoreImplServletBatchMetadataServlet
 */
class ComDayCqDamCoreImplServletBatchMetadataServletQueryData
{
    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"csv"})
     * @var string[]
     */
    public $propertylist;
    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $post;
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $apply;
    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
    /**
     * @DTA\Data(field="cq.dam.batch.metadata.collection.default", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $cq_dam_batch_metadata_collection_default;
    /**
     * @DTA\Data(field="cq.dam.batch.metadata.maxresources", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $cq_dam_batch_metadata_maxresources;
    /**
     * @DTA\Data(field="cq.dam.batch.metadata.asset.default", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $cq_dam_batch_metadata_asset_default;
}
