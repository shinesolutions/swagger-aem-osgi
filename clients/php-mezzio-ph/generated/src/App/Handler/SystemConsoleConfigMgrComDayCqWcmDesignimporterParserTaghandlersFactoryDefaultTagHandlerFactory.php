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
 * @PHA\Route(pattern="/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory")
 */
class SystemConsoleConfigMgrComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHandlerFactory
{
    /**
     * @PHA\Post()
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanQueryData::class,
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
     * @return \App\DTO\ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
     */
    public function comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan(ServerRequestInterface $request): \App\DTO\ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
    {
        //TODO implement method
        /** @var \App\DTO\ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
