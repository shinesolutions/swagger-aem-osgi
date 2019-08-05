function New-ComDayCqWcmScriptingImplBVPManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmScriptingImplBVPManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmScriptingImplBVPManagerProperties -ArgumentList @(
            ${comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines}
        )
    }
}
