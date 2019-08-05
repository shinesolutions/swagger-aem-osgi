<?php
/**
 * ComAdobeCqAuditPurgeReplicationProperties
 */
namespace app\Models;

/**
 * ComAdobeCqAuditPurgeReplicationProperties
 */
class ComAdobeCqAuditPurgeReplicationProperties {

    /** @var \app\Models\ConfigNodePropertyString $auditlog_rule_name */
    private $auditlog_rule_name;

    /** @var \app\Models\ConfigNodePropertyString $auditlog_rule_contentpath */
    private $auditlog_rule_contentpath;

    /** @var \app\Models\ConfigNodePropertyInteger $auditlog_rule_minimumage */
    private $auditlog_rule_minimumage;

    /** @var \app\Models\ConfigNodePropertyDropDown $auditlog_rule_types */
    private $auditlog_rule_types;

}
