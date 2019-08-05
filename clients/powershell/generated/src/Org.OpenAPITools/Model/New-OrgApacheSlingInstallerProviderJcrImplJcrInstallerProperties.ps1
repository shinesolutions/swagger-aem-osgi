function New-OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${handlerPeriodschemes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodjcrinstallPeriodsearchPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodjcrinstallPeriodsignalPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${slingPeriodjcrinstallPeriodenablePeriodwriteback}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties -ArgumentList @(
            ${handlerPeriodschemes},
            ${slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp},
            ${slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth},
            ${slingPeriodjcrinstallPeriodsearchPeriodpath},
            ${slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath},
            ${slingPeriodjcrinstallPeriodsignalPeriodpath},
            ${slingPeriodjcrinstallPeriodenablePeriodwriteback}
        )
    }
}
