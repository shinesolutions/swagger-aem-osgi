function New-ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pathBuilderPeriodtarget},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${suggestPeriodbasepath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties -ArgumentList @(
            ${pathBuilderPeriodtarget},
            ${suggestPeriodbasepath}
        )
    }
}
