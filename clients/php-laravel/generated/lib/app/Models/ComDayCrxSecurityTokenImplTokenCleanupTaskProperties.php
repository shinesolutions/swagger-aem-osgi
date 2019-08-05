<?php
/**
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 */
namespace app\Models;

/**
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 */
class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $enable_token_cleanup_task */
    private $enable_token_cleanup_task;

    /** @var \app\Models\ConfigNodePropertyString $scheduler_expression */
    private $scheduler_expression;

    /** @var \app\Models\ConfigNodePropertyInteger $batch_size */
    private $batch_size;

}
