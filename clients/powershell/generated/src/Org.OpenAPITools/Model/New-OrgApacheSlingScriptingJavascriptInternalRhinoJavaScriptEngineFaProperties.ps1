function New-OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel}
        )
    }
}
