<?php
/**
 * ComDayCqMailerDefaultMailServiceProperties
 */
namespace app\Models;

/**
 * ComDayCqMailerDefaultMailServiceProperties
 */
class ComDayCqMailerDefaultMailServiceProperties {

    /** @var \app\Models\ConfigNodePropertyString $smtp_host */
    private $smtp_host;

    /** @var \app\Models\ConfigNodePropertyInteger $smtp_port */
    private $smtp_port;

    /** @var \app\Models\ConfigNodePropertyString $smtp_user */
    private $smtp_user;

    /** @var \app\Models\ConfigNodePropertyString $smtp_password */
    private $smtp_password;

    /** @var \app\Models\ConfigNodePropertyString $from_address */
    private $from_address;

    /** @var \app\Models\ConfigNodePropertyBoolean $smtp_ssl */
    private $smtp_ssl;

    /** @var \app\Models\ConfigNodePropertyBoolean $smtp_starttls */
    private $smtp_starttls;

    /** @var \app\Models\ConfigNodePropertyBoolean $debug_email */
    private $debug_email;

}
