<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrgApacheFelixEventadminImplEventAdminProperties
{
    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.ThreadPoolSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $org_apache_felix_eventadmin_thread_pool_size = null;

    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.AsyncToSyncThreadRatio", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyFloat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyFloat::class})
     */
    public ?\App\DTO\ConfigNodePropertyFloat $org_apache_felix_eventadmin_async_to_sync_thread_ratio = null;

    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.Timeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $org_apache_felix_eventadmin_timeout = null;

    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.RequireTopic", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $org_apache_felix_eventadmin_require_topic = null;

    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.IgnoreTimeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $org_apache_felix_eventadmin_ignore_timeout = null;

    /**
     * @DTA\Data(field="org.apache.felix.eventadmin.IgnoreTopic", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $org_apache_felix_eventadmin_ignore_topic = null;

}
