<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheFelixEventadminImplEventAdminProperties
{
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.ThreadPoolSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $org_apache_felix_eventadmin_thread_pool_size;
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.AsyncToSyncThreadRatio", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyFloat::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyFloat::class})
     * @var \App\DTO\ConfigNodePropertyFloat
     */
    public $org_apache_felix_eventadmin_async_to_sync_thread_ratio;
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.Timeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $org_apache_felix_eventadmin_timeout;
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.RequireTopic", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $org_apache_felix_eventadmin_require_topic;
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.IgnoreTimeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $org_apache_felix_eventadmin_ignore_timeout;
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.IgnoreTopic", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $org_apache_felix_eventadmin_ignore_topic;
}
