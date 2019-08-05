<?php
/**
 * Adobe Experience Manager OSGI config (AEM) API
 * @version 1.0.0-pre.0
 */

require_once __DIR__ . '/vendor/autoload.php';

use OpenAPIServer\SlimRouter;

$router = new SlimRouter();
$app = $router->getSlimApp();
$app->run();
