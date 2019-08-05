function New-OrgApacheHttpProxyconfiguratorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${proxyPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${proxyPeriodport},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${proxyPeriodexceptions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheHttpProxyconfiguratorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheHttpProxyconfiguratorProperties -ArgumentList @(
            ${proxyPeriodenabled},
            ${proxyPeriodhost},
            ${proxyPeriodport},
            ${proxyPerioduser},
            ${proxyPeriodpassword},
            ${proxyPeriodexceptions}
        )
    }
}
