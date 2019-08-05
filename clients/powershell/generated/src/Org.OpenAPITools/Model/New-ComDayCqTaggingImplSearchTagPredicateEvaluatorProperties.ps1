function New-ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${ignoreUnderscorepath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties -ArgumentList @(
            ${ignoreUnderscorepath}
        )
    }
}
