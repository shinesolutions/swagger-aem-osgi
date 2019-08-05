function New-ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${locale},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${imsConfig}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties -ArgumentList @(
            ${name},
            ${locale},
            ${imsConfig}
        )
    }
}
