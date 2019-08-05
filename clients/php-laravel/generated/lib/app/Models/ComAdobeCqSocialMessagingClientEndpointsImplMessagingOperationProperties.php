<?php
/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
namespace app\Models;

/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {

    /** @var \app\Models\ConfigNodePropertyArray $message_properties */
    private $message_properties;

    /** @var \app\Models\ConfigNodePropertyInteger $message_box_size_limit */
    private $message_box_size_limit;

    /** @var \app\Models\ConfigNodePropertyInteger $message_count_limit */
    private $message_count_limit;

    /** @var \app\Models\ConfigNodePropertyBoolean $notify_failure */
    private $notify_failure;

    /** @var \app\Models\ConfigNodePropertyString $failure_message_from */
    private $failure_message_from;

    /** @var \app\Models\ConfigNodePropertyString $failure_template_path */
    private $failure_template_path;

    /** @var \app\Models\ConfigNodePropertyInteger $max_retries */
    private $max_retries;

    /** @var \app\Models\ConfigNodePropertyInteger $min_wait_between_retries */
    private $min_wait_between_retries;

    /** @var \app\Models\ConfigNodePropertyInteger $count_update_pool_size */
    private $count_update_pool_size;

    /** @var \app\Models\ConfigNodePropertyString $inbox_path */
    private $inbox_path;

    /** @var \app\Models\ConfigNodePropertyString $sentitems_path */
    private $sentitems_path;

    /** @var \app\Models\ConfigNodePropertyBoolean $support_attachments */
    private $support_attachments;

    /** @var \app\Models\ConfigNodePropertyBoolean $support_group_messaging */
    private $support_group_messaging;

    /** @var \app\Models\ConfigNodePropertyInteger $max_total_recipients */
    private $max_total_recipients;

    /** @var \app\Models\ConfigNodePropertyInteger $batch_size */
    private $batch_size;

    /** @var \app\Models\ConfigNodePropertyInteger $max_total_attachment_size */
    private $max_total_attachment_size;

    /** @var \app\Models\ConfigNodePropertyArray $attachment_type_blacklist */
    private $attachment_type_blacklist;

    /** @var \app\Models\ConfigNodePropertyArray $allowed_attachment_types */
    private $allowed_attachment_types;

    /** @var \app\Models\ConfigNodePropertyString $service_selector */
    private $service_selector;

    /** @var \app\Models\ConfigNodePropertyArray $field_whitelist */
    private $field_whitelist;

}
