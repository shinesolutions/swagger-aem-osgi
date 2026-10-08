<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl
 */
class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplParameterData
{
    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = null;

    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = null;

    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = null;

}
