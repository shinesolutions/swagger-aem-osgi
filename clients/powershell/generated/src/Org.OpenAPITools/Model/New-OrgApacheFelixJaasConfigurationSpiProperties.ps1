function New-OrgApacheFelixJaasConfigurationSpiProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPerioddefaultRealmName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPeriodconfigProviderName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${jaasPeriodglobalConfigPolicy}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixJaasConfigurationSpiProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixJaasConfigurationSpiProperties -ArgumentList @(
            ${jaasPerioddefaultRealmName},
            ${jaasPeriodconfigProviderName},
            ${jaasPeriodglobalConfigPolicy}
        )
    }
}
