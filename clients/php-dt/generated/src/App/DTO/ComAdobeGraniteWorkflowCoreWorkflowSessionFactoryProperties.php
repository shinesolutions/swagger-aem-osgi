<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
{
    /**
     * @DTA\Data(field="granite.workflowinbox.sort.propertyName", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     */
    public ?\App\DTO\ConfigNodePropertyDropDown $granite_workflowinbox_sort_property_name = null;

    /**
     * @DTA\Data(field="granite.workflowinbox.sort.order", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $granite_workflowinbox_sort_order = null;

    /**
     * @DTA\Data(field="cq.workflow.job.retry", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_workflow_job_retry = null;

    /**
     * @DTA\Data(field="cq.workflow.superuser", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_workflow_superuser = null;

    /**
     * @DTA\Data(field="granite.workflow.inboxQuerySize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $granite_workflow_inbox_query_size = null;

    /**
     * @DTA\Data(field="granite.workflow.adminUserGroupFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $granite_workflow_admin_user_group_filter = null;

    /**
     * @DTA\Data(field="granite.workflow.enforceWorkitemAssigneePermissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $granite_workflow_enforce_workitem_assignee_permissions = null;

    /**
     * @DTA\Data(field="granite.workflow.enforceWorkflowInitiatorPermissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $granite_workflow_enforce_workflow_initiator_permissions = null;

    /**
     * @DTA\Data(field="granite.workflow.injectTenantIdInJobTopics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $granite_workflow_inject_tenant_id_in_job_topics = null;

    /**
     * @DTA\Data(field="granite.workflow.maxPurgeSaveThreshold", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $granite_workflow_max_purge_save_threshold = null;

    /**
     * @DTA\Data(field="granite.workflow.maxPurgeQueryCount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $granite_workflow_max_purge_query_count = null;

}
