function New-OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodsearchpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodmanglenamespaces},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodallowDirect},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodrequiredPeriodproviders},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodrequiredPeriodprovidernames},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodvirtual},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodmapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${resourcePeriodresolverPeriodmapPeriodlocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodmapPeriodobservation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodenablePeriodvanitypath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${resourcePeriodresolverPeriodvanitypathPeriodmaxEntries},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodvanitypathPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodresolverPeriodvanitypathPeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodvanityPeriodprecedence},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodproviderhandlingPeriodparanoid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodlogPeriodclosing},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${resourcePeriodresolverPeriodlogPeriodunclosed}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties -ArgumentList @(
            ${resourcePeriodresolverPeriodsearchpath},
            ${resourcePeriodresolverPeriodmanglenamespaces},
            ${resourcePeriodresolverPeriodallowDirect},
            ${resourcePeriodresolverPeriodrequiredPeriodproviders},
            ${resourcePeriodresolverPeriodrequiredPeriodprovidernames},
            ${resourcePeriodresolverPeriodvirtual},
            ${resourcePeriodresolverPeriodmapping},
            ${resourcePeriodresolverPeriodmapPeriodlocation},
            ${resourcePeriodresolverPeriodmapPeriodobservation},
            ${resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus},
            ${resourcePeriodresolverPeriodenablePeriodvanitypath},
            ${resourcePeriodresolverPeriodvanitypathPeriodmaxEntries},
            ${resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup},
            ${resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes},
            ${resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution},
            ${resourcePeriodresolverPeriodvanitypathPeriodwhitelist},
            ${resourcePeriodresolverPeriodvanitypathPeriodblacklist},
            ${resourcePeriodresolverPeriodvanityPeriodprecedence},
            ${resourcePeriodresolverPeriodproviderhandlingPeriodparanoid},
            ${resourcePeriodresolverPeriodlogPeriodclosing},
            ${resourcePeriodresolverPeriodlogPeriodunclosed}
        )
    }
}
