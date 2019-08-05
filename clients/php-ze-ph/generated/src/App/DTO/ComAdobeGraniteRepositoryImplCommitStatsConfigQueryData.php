<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comAdobeGraniteRepositoryImplCommitStatsConfig
 */
class ComAdobeGraniteRepositoryImplCommitStatsConfigQueryData
{
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $apply;
    /**
     * @DTA\Data(field="threadMatchers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $thread_matchers;
    /**
     * @DTA\Data(field="greedyStackMatchers", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $greedy_stack_matchers;
    /**
     * @DTA\Data(field="minDetailsPercentage", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $min_details_percentage;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
    /**
     * @DTA\Data(field="enabled", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $enabled;
    /**
     * @DTA\Data(field="maxLocationLength", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $max_location_length;
    /**
     * @DTA\Data(field="maxDetailsShown", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $max_details_shown;
    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"csv"})
     * @var string[]
     */
    public $propertylist;
    /**
     * @DTA\Data(field="commitsPerIntervalThreshold", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $commits_per_interval_threshold;
    /**
     * @DTA\Data(field="stackShorteners", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $stack_shorteners;
    /**
     * @DTA\Data(field="stackFilters", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $stack_filters;
    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $post;
    /**
     * @DTA\Data(field="stackCategorizers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $stack_categorizers;
    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="maxGreedyDepth", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $max_greedy_depth;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="stackMatchers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $stack_matchers;
    /**
     * @DTA\Data(field="intervalSeconds", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $interval_seconds;
}
