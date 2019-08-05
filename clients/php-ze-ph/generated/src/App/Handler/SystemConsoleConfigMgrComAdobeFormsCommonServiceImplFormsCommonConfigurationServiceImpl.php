<?php

namespace App\Handler;

use Articus\PathHandler\Operation;
use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl")
 */
class SystemConsoleConfigMgrComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpl implements Operation\PostInterface
{
    /**
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="text/plain")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 500 if the method is not implemented
     *
     * @return \App\DTO\ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo
     */
    public function handlePost(ServerRequestInterface $request)
    {
        //TODO implement method
        /** @var \App\DTO\ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(500, "Not implemented");
    }
}
