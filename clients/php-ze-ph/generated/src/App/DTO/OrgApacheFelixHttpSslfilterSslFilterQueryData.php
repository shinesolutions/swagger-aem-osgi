<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for orgApacheFelixHttpSslfilterSslFilter
 */
class OrgApacheFelixHttpSslfilterSslFilterQueryData
{
    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"csv"})
     * @var string[]
     */
    public $propertylist;
    /**
     * @DTA\Data(field="ssl-forward.value", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $ssl_forward_value;
    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $post;
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $apply;
    /**
     * @DTA\Data(field="ssl-forward-cert.header", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $ssl_forward_cert_header;
    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="ssl-forward.header", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $ssl_forward_header;
    /**
     * @DTA\Data(field="rewrite.absolute.urls", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $rewrite_absolute_urls;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
}
