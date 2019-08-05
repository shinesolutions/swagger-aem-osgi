<?php
/**
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
 */
namespace app\Models;

/**
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
 */
class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {

    /** @var \app\Models\ConfigNodePropertyString $event_filter */
    private $event_filter;

    /** @var \app\Models\ConfigNodePropertyInteger $min_thread_pool_size */
    private $min_thread_pool_size;

    /** @var \app\Models\ConfigNodePropertyInteger $max_thread_pool_size */
    private $max_thread_pool_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $cq_wcm_workflow_terminate_on_activate */
    private $cq_wcm_workflow_terminate_on_activate;

    /** @var \app\Models\ConfigNodePropertyArray $cq_wcm_worklfow_terminate_exclusion_list */
    private $cq_wcm_worklfow_terminate_exclusion_list;

}
