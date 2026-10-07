<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet")
 */
class SystemConsoleConfigMgrComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationServlet
{
    /**
     * @PHA\Post()
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="text/plain")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo
     */
    public function comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS(ServerRequestInterface $request): \App\DTO\ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo
    {
        //TODO implement method
        /** @var \App\DTO\ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
