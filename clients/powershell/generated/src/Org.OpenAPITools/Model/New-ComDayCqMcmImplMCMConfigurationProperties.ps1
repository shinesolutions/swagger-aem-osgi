function New-ComDayCqMcmImplMCMConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${experiencePeriodindirection},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${touchpointPeriodindirection}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMcmImplMCMConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMcmImplMCMConfigurationProperties -ArgumentList @(
            ${experiencePeriodindirection},
            ${touchpointPeriodindirection}
        )
    }
}
