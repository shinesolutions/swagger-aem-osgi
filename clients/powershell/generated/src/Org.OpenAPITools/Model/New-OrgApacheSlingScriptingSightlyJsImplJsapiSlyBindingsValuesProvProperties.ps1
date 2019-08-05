function New-OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings}
        )
    }
}
