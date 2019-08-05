function New-OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize},
            ${orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions}
        )
    }
}
