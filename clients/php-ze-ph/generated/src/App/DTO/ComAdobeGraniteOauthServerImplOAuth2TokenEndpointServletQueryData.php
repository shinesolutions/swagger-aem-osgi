<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet
 */
class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletQueryData
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
     * @DTA\Data(field="oauth.issuer", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $oauth_issuer;
    /**
     * @DTA\Data(field="osgi.http.whiteboard.servlet.pattern", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $osgi_http_whiteboard_servlet_pattern;
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
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="osgi.http.whiteboard.context.select", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $osgi_http_whiteboard_context_select;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
    /**
     * @DTA\Data(field="oauth.access.token.expires.in", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $oauth_access_token_expires_in;
}
