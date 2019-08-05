function New-ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${offloadingPeriodagentmanagerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties -ArgumentList @(
            ${offloadingPeriodagentmanagerPeriodenabled}
        )
    }
}
