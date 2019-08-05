function New-ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${adaptPeriodsupportedPeriodwidths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties -ArgumentList @(
            ${adaptPeriodsupportedPeriodwidths}
        )
    }
}
