<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
{
    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name = null;

    /**
     * @DTA\Data(field="cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name = null;

}
