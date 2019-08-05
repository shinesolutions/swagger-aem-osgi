function New-ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodexpiredPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkPeriodexpiredPeriodremove},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodexpiredPeriodsuffix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodinvalidPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkPeriodinvalidPeriodremove},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodinvalidPeriodsuffix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodpredatedPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkPeriodpredatedPeriodremove},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${linkPeriodpredatedPeriodsuffix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${linkPeriodwcmmodes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties -ArgumentList @(
            ${linkPeriodexpiredPeriodprefix},
            ${linkPeriodexpiredPeriodremove},
            ${linkPeriodexpiredPeriodsuffix},
            ${linkPeriodinvalidPeriodprefix},
            ${linkPeriodinvalidPeriodremove},
            ${linkPeriodinvalidPeriodsuffix},
            ${linkPeriodpredatedPeriodprefix},
            ${linkPeriodpredatedPeriodremove},
            ${linkPeriodpredatedPeriodsuffix},
            ${linkPeriodwcmmodes}
        )
    }
}
